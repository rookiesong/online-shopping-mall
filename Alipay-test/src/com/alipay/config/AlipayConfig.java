package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101100658040";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDGi2yYj/ZXwQs6iYdLDbF1RteCRWGPufYyV4a+Hl0ozpiZV+jllW2yJPWbD5+PVm8Djea9qY3jm5MP6dwngzDd5AXe9EQMfQKujhzutUG30boOdBH9ZDOtUuxXBazap5PFr1wzS2Fv2csfZiEqxK5xYv5KXUSUY9b1RQ/eMxCkG5bhcFUM8UMDG6p6ZVH9SBr7A61azdCYbrnK6h+V7SAs0tzaqPTpWmTnaTyxgaLlBpBbViAzmr7PyQbDy7niUG53piOPo4Ygo4PSuclgiP5dcdaT4QYrGL+I9ZVcUrbTO4HyM11/W26UctzBV946bUA3dVUPupZwKEJGR0GWhPl5AgMBAAECggEBALmEi7teQWur+McAvMdXiyqvQC38kHXQ6IgPmtrI2nmH2bTnHLpxTue3ezshdRFlTSQAEsvDw84aj2a+OTU+c4nSR94VVgRpRvk91zEBct/E+1oIAMtJNrRMmIOTzPkevohoG/neBLSTyCWVs4YX83wFaOCpl6wkQjY6CuKvymvbqbwYNsc7peiD2poXR99aqXK4DfO1LiR5leTW3ase57iaON2w2taPUWTmeyC7lli00m8ANOtbJDuBUTFf35p7eQ13SaByjDv52P95OAjDtASllvFTqo5Mu0R272fR0X7KJquagMeYpWlXStggXQ7/8bA4HE2Bzu6HTaY6BHm4mrUCgYEA7muFz5uh25F148fHyr1HNDgUXpGw9BFWFr/Kz/ujNPzW8j0IpZfkFq3ftujYPoBswI6dpU0nEwtHwDHFyxOlA/tiizhJ4ExfQ9nh9hYKETmHRbGHrgLeZI9NuYQs+9vHxIH7490jLzbJ6Jlm1rrgmpMyQB4xqcL30pbuqc6LdesCgYEA1S80GSU7Zl+AR+zHYih8cIggOqYzdSIkmqOPcAjvbcACmV5Uq5NSHHWcd+mAI4xfihhZ5riEOBH0VQLVR8/5PM45n88EAxGBj5eUQiHd6GCUskpthzibGhF6uhNQEaRiHxyxtfL/UVZ5l6HEpxlbik4IOhJp8xNPGFxixx0WwSsCgYBBCvZTX/r1IqbNwFfiGGcPeOkdr5Nd0kjxJduXh+fLcdrV9Q6h1mE0SrUIeldcHb8NfRrG2Nh7Go21gh6auz4+attEbdPBrDQlF5DMiNCwSEh+G+OO9ltjhbDHlqaLAzdphaiJTm/l1oWYvhjPJeZWZSfFVDdqP7VKL0Dm9GEZhwKBgCdooXXghxmGn/0rzTPdDhvzXhnZbXvCwwd/It3wGOqt6w0U/gv1oOE38KPOG2z23xZ1J/FZvL9sukEY0/qBfK575PUg3LoAe3Xi7HpJLm9toy9OSO8NTMbF4m0RcuTAAY+Ey2k6MW6E0NdyBRtquZxYjnbFvqY7tIxpT61FOFafAoGAFLVSqa24Ql1eu5sH0WidAO81uo55e2KX1y1bBi7Sm6Z5dag49Pu1AN+UOfMzC7ijKAMLFsAl5VX++sn+uHVXiY0uGvt+/5TvHPaNz/bP+Zx1d0oxotpL21LxGv7RDxbC+Vu9xuVJrzND5S7MIoiQeP5DRUOedSSp6a6PhFIpzEY=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlCTxOipKYYASo0aOdIanHowAZlBcE0GJzvmQy+PK/Xtiv6nmTd4ASGdcLustpMZjc5qUEbcQoRyZFsp4dDeFtIvaN+zx7dD5hHDqi+utjR3PIIQomYN9FMgGYW8tzZJbH6JlWEIYOMh5gkURqGLvsbgGz56bvk6AFieH4d+SkuaG1iGUZcbwUCBGMEZomtbaolhYT6hSHkhNpj83qKyFDPlWT8JWVW2aohrlxp9If2DOkaXA1z5fc0OGWdGAtRD0ej+ukRw2pujmJ0wMFGHKiKgqsa8/U0ycZPF/oLRgGOLDYy3XuTyX1Sei7dV2ndmG5aWOatZBqnnE2PFpp/1EywIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

