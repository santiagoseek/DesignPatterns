package com.san.lib.design.factory;

/**
 * Created by test on 18/3/26.
 */

public class LocationFactory {

	public static Location getInstance(String type){
		if("baidu".equals(type)){
			return new BaiduLocation();
		}else{
			if("gaode".equals(type)){
				return new GaodeLocation();
			}else{
				return null;
			}
		}
	}


	static class BaiduLocation implements Location{
		@Override
		public void getPosition() {
			System.out.println("通过百度定位获取当前的位置信息。。。");
		}

		@Override
		public void getCityName(long lat, long lng) {
			System.out.println("通过百度定位获取当前的城市信息。。。。。");
		}
	}

	static class GaodeLocation implements Location{
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
