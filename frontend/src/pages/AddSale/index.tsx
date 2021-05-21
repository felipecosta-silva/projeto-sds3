import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";


const AddSale = () => {

  return (
    <>
      <NavBar />
      <div className="container">
        <div className="jumbotron">
          <h1 className="display-4">
            Add Sale
          </h1>
          <hr />
          <Link className="btn btn-primary mr-5 btn-lg" to="/dashboard">
            Salvar
          </Link>
          <Link className="btn btn-danger btn-lg" to="/dashboard">
            Cancel
          </Link>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default AddSale;