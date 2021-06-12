/*     */ package qtud.utils;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class DateTimeUtils
/*     */ {
/*     */   public static Date convertStringToTime(String date, String pattern)
/*     */   {
/*  27 */     SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
/*     */     try {
/*  29 */       return dateFormat.parse(date);
/*     */     }
/*     */     catch (ParseException e) {
/*  32 */       e.printStackTrace();
/*  33 */       System.out.println("Date ParseException, string value:" + date);
/*     */     }
/*  35 */     return null;
/*     */   }
/*     */ 
/*     */   public static Date convertStringToDate(String date) throws Exception {
/*  39 */     String pattern = "dd/MM/yyyy";
/*  40 */     return convertStringToTime(date, pattern);
/*     */   }
/*     */ 
/*     */   public static String convertDateToString(Date date)
/*     */     throws Exception
/*     */   {
/*  49 */     SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
/*     */     try {
/*  51 */       return dateFormat.format(date);
/*     */     } catch (Exception e) {
/*  53 */       throw e;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static String getSysdate()
/*     */     throws Exception
/*     */   {
/*  63 */     Calendar calendar = Calendar.getInstance();
/*  64 */     return convertDateToString(calendar.getTime());
/*     */   }
/*     */ 
/*     */   public static Date getDate() throws Exception {
/*  68 */     Calendar calendar = Calendar.getInstance();
/*  69 */     return calendar.getTime();
/*     */   }
/*     */ 
/*     */   public static String getSysDateTime()
/*     */     throws Exception
/*     */   {
/*  78 */     Calendar calendar = Calendar.getInstance();
/*  79 */     SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
/*     */     try {
/*  81 */       return dateFormat.format(calendar.getTime());
/*     */     } catch (Exception e) {
/*  83 */       throw e;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static Date convertStringToDateTime(String date)
/*     */     throws Exception
/*     */   {
/*  94 */     String pattern = "dd/MM/yyyy HH:mm:ss";
/*  95 */     return convertStringToTime(date, pattern);
/*     */   }
/*     */ 
/*     */   public static String convertDateTimeToString(Date date) throws Exception {
/*  99 */     SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
/*     */     try {
/* 101 */       return dateFormat.format(date);
/*     */     } catch (Exception e) {
/* 103 */       throw e;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static String convertTimeToString(Date date, String pattern)
/*     */     throws Exception
/*     */   {
/* 116 */     SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
/*     */     try {
/* 118 */       return dateFormat.format(date);
/*     */     } catch (Exception e) {
/* 120 */       throw e;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\lifetek\Projects\CAS\LTACCOUNT-IPT\New folder\ltaccounts\WEB-INF\classes\
 * Qualified Name:     com.lifetek.ltaccounts.util.DateTimeUtils
 * JD-Core Version:    0.6.2
 */