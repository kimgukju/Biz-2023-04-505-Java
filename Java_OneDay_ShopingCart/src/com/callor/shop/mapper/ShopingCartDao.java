package com.callor.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.callor.shop.mapper.sql.ShopingCartSQL;
import com.callor.shop.models.BuyerDto;
import com.callor.shop.models.IolistDto;
import com.callor.shop.models.ProductDto;

public interface ShopingCartDao {
	
	// 고객정보 CRUD  이름 정렬순으로 하게 하기위해 ORDER BY buName ASC 추가 
	@Select(" SELECT * FROM tbl_buyer ORDER BY buName ASC ")
	public List<BuyerDto> selectAllBuyer();
	
	@Select(" SELECT * FROM tbl_buyer WHERE buName = #{buyer} ")
	public BuyerDto findByBuyer(String buyer);
	
	@Insert(ShopingCartSQL.BUYER_INSERT)
	public int insertBuyer(BuyerDto dto);
	
	@Update(ShopingCartSQL.BUYER_UPDATE)
	public int updateBuyer(BuyerDto dto);
	
	// 상품정보 CRUD 상품 코드순으로 정렬 ORDER BY pCode ASC
	@Select(" SELECT * FROM tbl_product ORDER BY pCode ASC ")
	public List<ProductDto> selectAllProduct();
	
	@Select(" SELECT * FROM tbl_product WHERE pName = #{product} ")
	public ProductDto findByProduct(String product);
	
	@Insert(ShopingCartSQL.PRODUCT_INSERT)
	public int insertProduct(ProductDto dto);
	
	@Update(ShopingCartSQL.PRODUCT_UPDATE)
	public int updateProduct(ProductDto dto);
	
	// 거래등록 CRUD
	@Select(" SELECT * FROM tbl_iolist ")
	public List<IolistDto> selectAllIoList();
	
	@Select(" SELECT * FROM tbl_iolist WHERE SEQ = #{iolist} ")
	public IolistDto findByioList(String iolist);

	@Insert(ShopingCartSQL.PRODUCT_INSERT)
	public int insertIolist(IolistDto dto);
	
	@Update(ShopingCartSQL.PRODUCT_UPDATE)
	public int updateIolist(IolistDto dto);
	
	// 고객이름으로찾기, 상품명으로찾기, 거래일자별 조회
	
	@Select(" SELECT * FROM tbl_buyer WHERE buName LIKE '%' || 'name' || '%' ")
	public List<BuyerDto> findByBuyerName(String name);
	
	@Select(" SELECT * FROM tbl_product WHERE pName LIKE '%' || 'pname' || '%' ")
	public ProductDto findByProductName(String pname);
	
	@Select(" SELECT * FROM tbl_iolist WHERE ioDate BETWEEN 'date1' AND 'date2' ")
	public ProductDto findByioDate(String date1, String date2);
	

}
