import {Routes,Route,BrowserRouter} from "react-router-dom"
import Login from "./auth/Login"
import Signup from "./auth/Signup"


function App() {

  return (
      <BrowserRouter>
        <Routes>
          <Route path="/login" element = {<Login/>}/>
          <Route path="/signup" element = {<Signup/>}/>
        </Routes>
      </BrowserRouter>
  )
}

export default App
