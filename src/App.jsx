import { useContext } from "react";
import { BrowserRouter as Router, Routes, Route, Navigate } from "react-router-dom";
import { AuthProvider, AuthContext } from "./context/AuthContext";
import Login from "./components/Login";
import AdminDashboard from "./components/AdminDashboard";
import InstructorDashboard from "./components/InstructorDashboard";
import StudentDashboard from "./components/StudentDashboard";

function AppRoutes() {
  const { role } = useContext(AuthContext);

  return (
    <Routes>
      <Route path="/" element={<Login />} />
      <Route
        path="/dashboard"
        element={
          role === "admin" ? <AdminDashboard /> :
          role === "instructor" ? <InstructorDashboard /> :
          role === "student" ? <StudentDashboard /> :
          <Navigate to="/" />
        }
      />
    </Routes>
  );
}

function App() {
  return (
    <AuthProvider>
      <Router>
        <AppRoutes />
      </Router>
    </AuthProvider>
  );
}

export default App;
