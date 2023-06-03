// import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <nav class="navbar navbar-expand-lg navbar-light nav-bg">
        <div class="row nav-row">
          <div class="col-sm-8">
            <div class="col-sm-2">
              <a class="navbar-brand" href="#">Groupie</a>
            </div>
          </div>
          <div class="col-sm-4">
            <form class="form-inline my-2 my-lg-0">
              <div class="row">
                <div class="col-sm-10">
                  <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" />
                </div>
                <div class="col-sm-2">
                  <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </nav>
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
    </div>
  );
}

export default App;
