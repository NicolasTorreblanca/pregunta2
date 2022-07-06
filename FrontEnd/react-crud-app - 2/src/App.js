import './App.css';
import { Component } from 'react';
import { ProductoService } from './service/ProductoService';

import { Panel } from 'primereact/panel';
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';


export default class App extends Component{
  constructor(){
    super();
    this.state = {};
    this.productoService = new ProductoService();
  }

  componentDidMount(){
    this.productoService.getAll().then(data => this.setState({productos: data}));
  }

  render(){
    return(
            <Panel header = "Tabla Productos">
              <DataTable value= {this.state.productos}>
                <Column field ="id" header = "ID"> </Column>
                <Column field ="nombre" header = "Nombre"> </Column>
                <Column field ="precioCLP" header = "precioCLP"> </Column>
              </DataTable>
            </Panel>
    );
  }
}
