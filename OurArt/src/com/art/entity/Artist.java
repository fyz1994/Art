package com.art.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="artist")
public class Artist extends User
{
	
	@Column(name="artistType",nullable=false)
	@Enumerated(EnumType.STRING)
	private ARTISTTYPE artistType;
	
	@Column(name="photo",nullable=false)
	private  String photo;
	
	@Column(name="password",nullable=false)
	private String introduction;
	
	public ARTISTTYPE getArtistType() 
   	{
           return this.artistType;
   	}  
    public void setArtistType(ARTISTTYPE artistType) 
	{
    	this.artistType = artistType;
	}
    
    public String getPhoto() 
   	{
           return this.photo;
   	}  
    public void setPhoto(String photo) 
	{
    	this.photo = photo;
	}
    
    public String getIntroduction() 
   	{
           return this.introduction;
   	}  
    public void setIntroduction(String introduction) 
	{
    	this.introduction = introduction;
	}
	
	
	
	
		
	
}
