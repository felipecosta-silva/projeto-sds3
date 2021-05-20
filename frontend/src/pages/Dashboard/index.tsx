import Footer from "components/Footer";
import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";
import DataTable from "components/DataTable";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Dashboard = () => {

  return (
    <>
      <NavBar />
      <div className="container">
        <div className="row">
          <h1 className="col-md-10 col-sm-11 text-primary pt-3">
            Dashboard de Vendas
          </h1>
          <Link className="col btn btn-outline-primary my-4" to="/addsale">
            Add Sale
          </Link>

        </div>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Sucesso (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Sucesso (%)</h5>
            <DonutChart />
          </div>
        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas as Vendas</h2>
        </div>

        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default Dashboard;