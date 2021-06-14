/*    */ package qtud.utils;
/*    */ 
/*    */ public abstract interface Constants
/*    */ {
/*    */   public static abstract interface Action
/*    */   {
/*    */     public static final String UPDATE_AND_CLOSE = "updateAndClose";
/*    */   }
/*    */ 
/*    */   public static abstract interface CAT_IMPORT_FILE
/*    */   {
				
/*    */     public static final String PATH_TO_UPLOAD = "Upload";
/*    */     public static final String DUPLICATE_CAT_NAME = "Tên danh mục %s đã có trong hệ thống";
/*    */     public static final String DUPLICATE_CAT_CODE = "Mã danh mục %s đã có trong hệ thống";
/*    */     public static final int PHONE = 1;
/*    */     public static final int IMPORT_FILE_COL_STT = 0;
/*    */     public static final int IMPORT_FILE_COL_NAME = 1;
/*    */     public static final int IMPORT_FILE_COL_ADD_WH = 3;
/*    */     public static final int IMPORT_FILE_COL_CODE_WH = 2;
/*    */     public static final int IMPORT_FILE_COL_GROUP_WH = 4;
/*    */     public static final int IMPORT_FILE_COL_PARENT_WH = 5;
/*    */     public static final int IMPORT_FILE_COL_ADD = 2;
/*    */     public static final int IMPORT_FILE_COL_PHONE = 3;
/*    */     public static final int IMPORT_FILE_COL_FAX = 5;
/*    */     public static final int IMPORT_FILE_COL_DESC = 2;
/*    */     public static final int IMPORT_FILE_COL_PARTNER_DESC = 4;
/*    */     public static final int IMPORT_FILE_COL_TYPE = 3;
/*    */     public static final int IMPORT_FILE_COL_TYPE_TECH = 3;
/*    */     public static final int IMPORT_FILE_COL_SHORT_CHAR = 3;
/*    */     public static final int IMPORT_FILE_COL_CODE_WORK_ITEM_TYPE = 3;
/*    */     public static final int IMPORT_FILE_COL_ID_WORK_ITEM_TYPE = 1;
/*    */     public static final int IMPORT_FILE_COL_ID_MERCHANDISE = 2;
/*    */     public static final int IMPORT_FILE_COL_COUNT_MERCHANDISE = 3;
/*    */     public static final int IMPORT_FILE_COL_CODE_WHP = 3;
/*    */     public static final int IMPORT_FILE_COL_PROVINCE_CODE = 2;
/*    */     public static final int IMPORT_FILE_COL_POSTAL_CODE = 3;
/*    */     public static final int IMPORT_FILE_COL_AREA_CODE = 4;
/*    */     public static final String IMPORT_FILE_STT_HEADER = "STT";
/*    */     public static final String IMPORT_FILE_NAME_HEADER = "Tên";
/*    */     public static final String IMPORT_FILE_DESCRIPTION_HEADER = "Mô tả";
/*    */     public static final String IMPORT_FILE_TYPE_HEADER = "Loại thu hồi";
/*    */     public static final String IMPORT_FILE_CLOSE_REASON_TYPE_HEADER = "Loại đối tượng áp dụng";
/*    */     public static final String IMPORT_FILE_STATUS_TYPE_HEADER = "Loại tình trạng";
/*    */     public static final String IMPORT_FILE_CODE_WH_HEADER = "Mã kho";
/*    */     public static final String IMPORT_FILE_PARENT_WH_HEADER = "Kho cha";
/*    */     public static final String IMPORT_FILE_ADD_HEADER = "Địa chỉ";
/*    */     public static final String IMPORT_FILE_GROUP_WH_HEADER = "Đơn vị quản lý kho";
/*    */     public static final String IMPORT_FILE_PHONE_HEADER = "Điện thoại";
/*    */     public static final String IMPORT_FILE_FAX_HEADER = "Fax";
/*    */     public static final String IMPORT_FILE_TYPE_TECH_HEADER = "Kiểu gói thầu";
/*    */     public static final String IMPORT_FILE_CODE_HEADER = "Mã tiền tệ";
/*    */     public static final String IMPORT_FILE_SHORT_CHAR_HEADER = "Kí hiệu";
/*    */     public static final String IMPORT_FILE_PROVINCE_CODE_HEADER = "Mã tỉnh thành";
/*    */     public static final String IMPORT_FILE_AREA_CODE_HEADER = "Mã vùng";
/*    */     public static final String IMPORT_FILE_POSTAL_CODE_HEADER = "Mã bưu chính";
/*    */     public static final String IMPORT_FILE_WORK_ITEM_TYPE_HEADER = "Mã loại hạng mục công trình";
/*    */     public static final String IMPORT_FILE_WHP_HEADER = "Mã vị trí trong kho";
/*    */     public static final String IMPORT_TITLE_ERROR_FORMAT = "Tiêu đề cột số thứ tự không đúng định dạng <br />";
/*    */     public static final String IMPORT_NAME_ERROR_FORMAT = "Tiêu đề cột Tên danh mục không đúng định dạng <br />";
/*    */     public static final String IMPORT_DESCRIPTION_ERROR_FORMAT = "Tiêu đề cột Mô tả không đúng định dạng <br />";
/*    */     public static final String IMPORT_TYPE_ERROR_FORMAT = "Tiêu đề cột Loại thu hồi không đúng định dạng <br />";
/*    */     public static final String IMPORT_CODE_WH_ERROR_FORMAT = "Tiêu đề cột Mã kho không đúng định dạng <br />";
/*    */     public static final String IMPORT_PARENT_WH_ERROR_FORMAT = "Tiêu đề cột Kho cha không đúng định dạng <br />";
/*    */     public static final String IMPORT_GROUP_WH_ERROR_FORMAT = "Tiêu đề cột Đơn vị quản lý kho không đúng định dạng <br />";
/*    */     public static final String IMPORT_ADD_WH_ERROR_FORMAT = "Tiêu đề cột Địa chỉ kho không đúng định dạng <br />";
/*    */     public static final String IMPORT_PHONE_ERROR_FORMAT = "Tiêu đề cột Số điện thoại không đúng định dạng <br />";
/*    */     public static final String IMPORT_FAX_ERROR_FORMAT = "Tiêu đề cột số Fax không đúng định dạng <br />";
/*    */     public static final String IMPORT_ADD_ERROR_FORMAT = "Tiêu đề cột Địa chỉ không đúng định dạng <br />";
/*    */     public static final String IMPORT_TYPE_TECH_ERROR_FORMAT = "Tiêu đề cột Kiểu gói thầu không đúng định dạng <br />";
/*    */     public static final String IMPORT_TYPE_RCAUSE_ERROR_FORMAT = "Tiêu đề cột Loại thu hồi không đúng định dạng <br />";
/*    */     public static final String IMPORT_TYPE_CLOSE_REASON_ERROR_FORMAT = "Tiêu đề cột Loại đối tượng áp dụng không đúng định dạng <br />";
/*    */     public static final String IMPORT_TYPE_STATUS_ERROR_FORMAT = "Tiêu đề cột Loại tình trạng không đúng định dạng <br />";
/*    */     public static final String IMPORT_PROVINCE_CODE_ERROR_FORMAT = "Tiêu đề cột Mã tỉnh thành không đúng định dạng <br />";
/*    */     public static final String IMPORT_AREA_CODE_ERROR_FORMAT = "Tiêu đề cột Mã vùng không đúng định dạng <br />";
/*    */     public static final String IMPORT_POSTAL_CODE_ERROR_FORMAT = "Tiêu đề cột Mã bưu chính không đúng định dạng <br />";
/*    */     public static final String IMPORT_WORK_ITEM_TYPE_ERROR_FORMAT = "Tiêu đề cột mã loại hạng mục không đúng định dạng <br />";
/*    */     public static final String IMPORT_WORK_ITEM_WHP_ERROR_FORMAT = "Tiêu đề cột Mã vị trí kho không đúng định dạng <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_ERROR = "File import không có dữ liệu <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_NAME = "Dữ liệu trường Tên không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_NAME = "Dữ liệu trường Tên không được > 200 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_NAME_FIVETY = "Dữ liệu trường Tên không được > 50 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_NAME_THREE = "Dữ liệu trường Tên không được > 300 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_NAME_FOUR = "Dữ liệu trường Tên không được > 400 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_DESC = "Dữ liệu trường Mô tả không được > 500 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_DESC_FIVETY = "Dữ liệu trường Mô tả không được > 50 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_CODE_FIVETY_WIT = "Dữ liệu trường Mã loại hạng mục không được > 50 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_PROVINCE_CODE_THREE = "Dữ liệu trường Mã tỉnh thành không được > 3 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_POSTAL_CODE = "Dữ liệu trường Mã bưu chính không được > 10 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_AREA_CODE = "Dữ liệu trường Mã vùng không được > 10 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_WHP_CODE = "Dữ liệu trường Mã vị trí trong kho không được > 10 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_DESC_ONE = "Dữ liệu trường Mô tả không được > 100 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_DESC_TWO = "Dữ liệu trường Mô tả không được > 200 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_DESC_THREE = "Dữ liệu trường Mô tả không được > 300 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_FAX_FIFTEEN = "Dữ liệu trường Số Fax không được > 15 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_SHORT_CHAR = "Dữ liệu trường Kí hiệu không được > 10 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_NAME_ONE = "Dữ liệu trường Tên không được > 100 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_NAME_TWO = "Dữ liệu trường Tên không được > 200 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_DESC_FOUR = "Dữ liệu trường Mô tả không được > 400 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_WH_CODE = "Dữ liệu trường Mã kho không được > 50 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_CURRENCY_CODE = "Dữ liệu trường Mã tiền tệ không được > 10 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_ADD_FIVE = "Dữ liệu trường Địa chỉ không được > 500 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_ADD_THREE = "Dữ liệu trường Địa chỉ không được > 300 kí tự <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_TYPE = "Dữ liệu trường Loại thu hồi không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_CLOSE_REASON_TYPE = "Dữ liệu trường Loại đối tượng áp dụng không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_STATUS_TYPE = "Dữ liệu trường Loại tình trạng không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_TYPE_INVAILID = "Dữ liệu trường Loại thu hồi không hợp lệ. Bạn chỉ có thể nhập loại: 'Thu hồi nội bộ' hoặc 'Thu hồi tài sản' <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_TYPE_CLOSE_REASON_INVAILID = "Dữ liệu trường Loại đối tượng áp dụng không hợp lệ. Bạn chỉ có thể nhập loại: 'Đề xuất đầu tư' hoặc 'Dự án đầu tư' <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_TYPE_STATUS_INVAILID = "Dữ liệu trường Loại tình trạng không hợp lệ. Bạn chỉ có thể nhập loại tình trạng: 'Hợp đồng' hoặc 'Gói thầu' <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_SHORT_CHAR = "Dữ liệu trường Kí hiệu không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_PROVINCE_CODE = "Dữ liệu trường Mã tỉnh thành không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_POSTAL_CODE = "Dữ liệu trường Mã bưu chính không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_AREA_CODE = "Dữ liệu trường Mã vùng không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_CODE_WH = "Dữ liệu trường Mã kho không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_PARENT_WH = "Dữ liệu trường Kho cha không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_CODE_WORK_ITEM_TYPE = "Dữ liệu trường Mã loại hạng mục không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_CODE_WHP = "Dữ liệu trường Mã vị trí kho không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_DESC = "Dữ liệu trường Description không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_CURRENCY_CODE = "Dữ liệu trường mã tiền tệ không được bỏ trống <br />";
/*    */     public static final String IMPORT_CODE_ERROR_FORMAT = "Tiêu đề cột mã tiền tệ không đúng định dạng <br />";
/*    */     public static final String IMPORT_SHORT_CHAR_ERROR_FORMAT = "Tiêu đề cột kí hiệu không đúng định dạng <br />";
/*    */     public static final String IMPORT_SHORT_EVAL_TECH_MS_FORMAT = "Gói thầu mua sắm";
/*    */     public static final String IMPORT_SHORT_EVAL_TECH_XL_FORMAT = "Gói thầu xây lắp";
/*    */     public static final String IMPORT_SHORT_RCAUSE_NB_FORMAT = "Thu hồi nội bộ";
/*    */     public static final String IMPORT_SHORT_RCAUSE_TS_FORMAT = "Thu hồi tài sản";
/*    */     public static final String IMPORT_SHORT_CLOSE_REASON_DXDT_FORMAT = "Đề xuất đầu tư";
/*    */     public static final String IMPORT_SHORT_CLOSE_REASON_DADT_FORMAT = "Dự án đầu tư";
/*    */     public static final String IMPORT_SHORT_STATUS_TTGT_FORMAT = "Gói thầu";
/*    */     public static final String IMPORT_SHORT_STATUS_TTHD_FORMAT = "Hợp đồng";
/*    */     public static final String IMPORT_FILE_ID_WORKITEM_HEADER = "Mã hạng mục";
/*    */     public static final String IMPORT_FILE_ID_MERCHANDISE_HEADER = "Mã hàng hóa";
/*    */     public static final String IMPORT_FILE_COUNT_HEADER = "Số lượng hàng hóa";
/*    */     public static final String IMPORT_ID_WORKITEM_ERROR_FORMAT = "Tiêu đề cột mã hạng mục không đúng định dạng <br />";
/*    */     public static final String IMPORT_ID_MERCHANDISE_ERROR_FORMAT = "Tiêu đề cột mã hàng hóa không đúng định dạng <br />";
/*    */     public static final String IMPORT_COUNT_ERROR_FORMAT = "Tiêu đề cột số lượng hàng hóa không đúng định dạng <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_ID_WORKITEM = "Dữ liệu mã hạng mục không được > 38 kí tự <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_ID_WORKITEM = "Dữ liệu trường mã hạng mục không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_ID_MERCHANDISE = "Dữ liệu trường mã hàng hóa không được > 38 kí tự <br />";
/*    */     public static final String IMPORT_FILE_TOO_LENGTH_COUNT = "Dữ liệu trường số lượng hàng hóa không được > 38 kí tự <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_COUNT = "Dữ liệu trường số lượng hàng hóa không được bỏ trống <br />";
/*    */     public static final String IMPORT_FILE_EMPTY_ID_MERCHANDISE = "Dữ liệu trường mã hàng hóa không được bỏ trống <br />";
/*    */     public static final String DUPLICATE_CAT_ID_WORKITEM_MERCHANDISE = "Mã hạng mục %s và mã hàng hóa %f đã có trong hệ thống";
/*    */   }
/*    */ 
/*    */   public static abstract interface STATUS
/*    */   {
/* 13 */     public static final Long CHECKED = Long.valueOf(6L);
/*    */ 
/* 15 */     public static final Long APPROVED = Long.valueOf(3L);
/*    */ 
/* 18 */     public static final Long APPROVED_CONSTR = Long.valueOf(3L);
/* 19 */     public static final Long STARTED_CONSTR = Long.valueOf(4L);
/* 20 */     public static final Long ACCEPTED_CONSTR = Long.valueOf(6L);
/*    */ 
/* 22 */     public static final Long WAIT_START_WORK_ITEM = Long.valueOf(2L);
/*    */ 
/* 24 */     public static final Long STARTWORK = Long.valueOf(4L);
/* 25 */     public static final Long STARTED_WORK_ITEM = Long.valueOf(3L);
/*    */ 
/* 27 */     public static final Long ACCEPTED_WORK_ITEM = Long.valueOf(5L);
/*    */ 
/* 29 */     public static final Long TRANSFERED_WORK_ITEM = Long.valueOf(6L);
/* 30 */     public static final Long TRANSFERED = Long.valueOf(7L);
/*    */   }
/*    */ }

/* Location:           D:\lifetek\Projects\CAS\LTACCOUNT-IPT\New folder\ltaccounts\WEB-INF\classes\
 * Qualified Name:     com.lifetek.ltaccounts.util.Constants
 * JD-Core Version:    0.6.2
 */