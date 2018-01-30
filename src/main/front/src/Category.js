import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Sample from './sample/Sample';
import Card from './Card'

class Category extends Component {
  render() {
    return (
          <ul className="list_category">
              <Card/>
              <Card/>
              <Card/>
          </ul>
    );
  }
}

export default Category;
