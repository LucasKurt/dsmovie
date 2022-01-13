import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import './styles.css'

export function Header() {
  return (
    <header>
      <nav className="container">
        <h1>DSmovie</h1>
        <a href="https://github.com/LucasKurt" target="_blank" rel="noreferrer">
          <div>
            <GithubIcon />
            <p>/LucasKurt</p>
          </div>
        </a>
      </nav>
    </header>
  );
}
