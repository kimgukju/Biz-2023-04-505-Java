package com.callor.shop.mapper.sql;

public class ShopingCartSQL {
	
	public static final String BUYER_INSERT
			= " INSERT INTO tbl_buyer("
			+ " buId, buName, buTel, buAddr)"
			+ " VALUES("
			+ " seq_buyer.NEXTVAL,#{buName} ,#{buTel} ,#{buAddr} ) ";
	
	public static final String BUYER_UPDATE
			= " UPDATE tbl_buyer "
			+ " SET buName = #{buName}, "
			+ " buTel = #{buTel}, "
			+ " buAddr = #{buAddr} "
			+ " WHERE buId = #{buId} ";
	
	public static final String PRODUCT_INSERT 
			= " INSERT INTO tbl_product("
			+ " pCode, pName, pItem, pIPrice, pOPrice) "
			+ " VALUES("
			+ " #{pCode}, #{pName}, #{pItem}, #{pIPrice}, #{pOPrice} ) ";
	
	public static final String PRODUCT_UPDATE
			= " UPDATE tbl_product "
			+ " SET pName = #{pName}, "
			+ " pItem = #{pItem}, "
			+ " pIPrice = #{pIPrice}, "
			+ " pOPrice = #{pOPrice} "
			+ " WHERE buId = #{pCode} ";
	
	public static final String IOLIST_INSERT 
			= " INSERT INTO tbl_iolist("
					+ " ioSEQ, ioDate, ioTime, ioBuId, ioPCode, ioQuan, ioPrice) "
					+ " VALUES("
					+ " seq_iolist.NEXTVAL, #{ioDate}, #{ioTime}, #{oBuId}, #{ioPCode}, #{ioQuan}, #{ioPrice} ) ";
	
	public static final String IOLIST_UPDATE 
			= " UPDATE tbl_iolist "
					+ " SET ioDate = #{ioDate}, "
					+ " ioTime = #{ioTime}, "
					+ " ioBuId = #{ioBuId}, "
					+ " ioPCode = #{ioPCode} "
					+ " ioQuan = #{ioQuan} "
					+ " ioPrice = #{ioPrice} "
					+ " WHERE buId = #{ioSEQ} ";
		
					

}
