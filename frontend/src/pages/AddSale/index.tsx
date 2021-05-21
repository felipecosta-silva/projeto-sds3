import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";
import { FaArrowLeft } from "react-icons/fa";


const AddSale = () => {

  return (
    <>
      <NavBar />
      <div className="container">
        <div className="jumbotron">
          <h1 className="display-4">
            <Link className="fs-5 me-3 my-auto" to="/dashboard">
              <FaArrowLeft />
            </Link>
            Add Sale
          </h1>
          <hr />
          <div>
            <select className="form-select" aria-label="Default select example">
              <option selected>Open this select menu</option>
              <option value="1">One</option>
              <option value="2">Two</option>
              <option value="3">Three</option>
            </select>
          </div>
          <Link className="btn btn-primary btn-lg" to="/dashboard">
            Salvar
          </Link>
          <Link className="btn btn-danger ms-5 btn-lg" to="/dashboard">
            Cancel
          </Link>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default AddSale;