package com.mj.service;

import java.util.List;

import com.mj.vo.VendorVO;

public interface VendorService {
	List<VendorVO> getAllVendor();
	VendorVO getVendorById(int id);
	void saveVendor(VendorVO vendorVO);
	void updateVendor(VendorVO vendorVo);
	void deleteVendor(int id);

}
