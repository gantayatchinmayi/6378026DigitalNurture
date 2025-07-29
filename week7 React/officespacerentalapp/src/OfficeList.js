import React from 'react';
import office1 from './assets/images/office1.jpg';
import office2 from './assets/images/office2.jpeg';
import office3 from './assets/images/office3.jpg';
import office4 from './assets/images/office4.jpeg';
import './OfficeList.css';


const OfficeList = () => {
const offices = [
  {
    name: 'WorkHub Space',
    rent: 55000,
    address: 'Bhubaneswar, Odisha',
    image: office1,
  },
  {
    name: 'TechNest',
    rent: 62000,
    address: 'Hyderabad, Telangana',
    image: office2,
  },
  {
    name: 'UrbanSpace',
    rent: 48000,
    address: 'Bangalore, Karnataka',
    image: office3,
  },
  {
    name: 'Skyline Towers',
    rent: 75000,
    address: 'Mumbai, Maharashtra',
    image: office4,
  }
];


  return (
    <div>
      {offices.map((office, idx) => {
        const rentStyle = {
          color: office.rent <= 60000 ? 'red' : 'green',
          fontWeight: 'bold',
        };

        return (
          <div key={idx} className="office-card">
            <h2>{office.name}</h2>
            <img
              src={office.image}
              alt={office.name}
              width="100%"
              height="200"
              style={{ objectFit: 'cover', borderRadius: '8px' }}
            />
            <p><strong>Address:</strong> {office.address}</p>
            <p>
              <strong>Rent:</strong> <span style={rentStyle}>₹{office.rent}</span>
            </p>
          </div>
        );
      })}
    </div>
  );
};

export default OfficeList;
