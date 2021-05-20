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
            <Link className="" to="/dashboard">
              <FaArrowLeft />
            </Link>
            Add Sale
          </h1>
          <hr />
          <Link className="btn btn-primary btn-lg" to="/dashboard">
            Salvar
          </Link>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default AddSale;