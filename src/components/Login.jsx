import { useContext, useState } from "react";
import { AuthContext } from "../context/AuthContext";
import { useNavigate } from "react-router-dom";

function Login() {
  const [selectedRole, setSelectedRole] = useState("");
  const { login } = useContext(AuthContext);
  const navigate = useNavigate();

  const handleLogin = () => {
    if (selectedRole) {
      login(selectedRole);
      navigate("/dashboard");
    }
  };

  return (
    <div style={{ textAlign: "center", marginTop: "100px" }}>
      <h2>E-Learning Login</h2>

      <select onChange={(e) => setSelectedRole(e.target.value)}>
        <option value="">Select Role</option>
        <option value="admin">Admin</option>
        <option value="instructor">Instructor</option>
        <option value="student">Student</option>
      </select>

      <br /><br />

      <button onClick={handleLogin}>Login</button>
    </div>
  );
}

export default Login;
