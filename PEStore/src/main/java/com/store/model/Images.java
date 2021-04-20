package com.store.model;

public class Images {
	public String thumbnail;
	public String small;
	public String large;
	
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getSmall() {
		return small;
	}
	public void setSmall(String small) {
		this.small = small;
	}
	public String getLarge() {
		return large;
	}
	public void setLarge(String large) {
		this.large = large;
	}
	@Override
	public String toString() {
		return "Images [thumbnail=" + thumbnail + ", small=" + small + ", large=" + large + "]";
	}
	
	
	
	

}
