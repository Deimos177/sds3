import { SalePage } from "types/sales";
import SetaEsquerda from "assets/img/seta-esquerda.svg";
import SetaDireita from "assets/img/seta-direita.svg";

type Props = {
  page: SalePage
  onPageChange: Function;
}

const Pagination = ({ page, onPageChange}: Props) => {
  return (
    <div className="row d-flex justify-content-center">
      <nav>
        <ul className="pagination">
          <li className={`page-item ${page.first?'disabled': ''}`}>
            <button className="page-link" onClick={()=> onPageChange(page.number -1)}><img src={SetaEsquerda} alt="SetaEsquerda" width="50"/></button>
          </li>
          <li className="page-item disabled">
            <span className="page-link">{page.number+1}</span>
          </li>
          <li className={`page-item ${page.last?'disabled': ''}`}>
            <button className="page-link" onClick={()=> onPageChange(page.number +1)}><img src={SetaDireita} alt="SetaEsquerda" width="50"/></button>
          </li>
        </ul>
      </nav>
    </div>
  );
};

export default Pagination