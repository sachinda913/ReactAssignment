import React from 'react';

const PhotoCard = ({ photo }) => {
  return (
    <div className="photo-card">
      <a href={`#photoView-${photo.id}`} className="photo-link">
        <img src={photo.avatar} alt="User" />
      </a>

      <div className="user-info">
        <h4>{photo.first_name}</h4>
        <p>{photo.email}</p>
      </div>
    </div>
  );
};



export default PhotoCard;