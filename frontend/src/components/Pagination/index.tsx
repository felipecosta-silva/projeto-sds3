/* eslint-disable jsx-a11y/anchor-is-valid */
import { SalePage } from "types/sale";

type Props = {
  page: SalePage;
  onPageChange: Function;
}

const Pagination = ({ page, onPageChange }: Props) => {

  return (
    <div className="d-flex justify-content-center">
      <nav aria-label="Page navigation example">
        <ul className="pagination">
          <li className={`page-item ${page.first ? 'disabled' : ''}`}>
            <a className="page-link" onClick={() => onPageChange(page.number - 1)}>Anterior</a></li>
          <li className={`page-item ${page.first ? 'disabled' : ''}`}>
            <a className="page-link">{page.number}</a></li>
          <li className="page-item active">
            <a className="page-link">{page.number + 1}</a></li>
          <li className={`page-item ${page.last ? 'disabled' : ''}`}>
            <a className="page-link">{page.number + 2}</a></li>
          <li className={`page-item ${page.last ? 'disabled' : ''}`}>
            <a className="page-link" onClick={() => onPageChange(page.number + 1)}>Próxima</a></li>
        </ul>
      </nav>
    </div>
  )
}

export default Pagination;