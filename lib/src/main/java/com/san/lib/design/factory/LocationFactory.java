package com.san.lib.design.factory;

/**
 * Created by test on 18/3/26.
 */

public class LocationFactory {

	public static ILocation getInstance(String type){
		if("baidu".equals(type)){
			return new BaiduILocation();
		}else{
			if("gaode".equals(type)){
				return new GaodeILocation();
			}else{
				return null;
			}
		}
	}


	static class BaiduILocation implements ILocation {
		@Override
		public void getPosition() {
			System.out.println("通过百度定位获取当前的位置信息。。。");
		}

		@Override
		public void getCityName(long lat, long lng) {
			System.out.println("通过百度定位获取当前的城市信息。。。。。");
		}
	}

	static class GaodeILocation implements ILocation {
		@Override
		public void getPosition() {
			System.out.println("通过高德定位获取当前的位置信息。。。");
		}

		@Override
		public void getCityName(long lat, long lng) {
			System.out.println("通过高德定位获取当前的城市信息。。。。。。。");
		}
	}
}
