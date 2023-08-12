import React from 'react';
import PhotoCard from './PhotoCard';

const PhotoGallery = ({ photos }) => {
  return (
    <div className="photo-gallery">
      {photos.map((photo, index) => (
        <PhotoCard key={index} photo={photo} />
      ))}
    </div>
  );
};

export default PhotoGallery;