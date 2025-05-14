package ksyun.client.bill_union.queryinstanceconsume.v20221222;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname QueryInstanceConsumeRequest
 * @Description 请求参数
 */
@Data
public class QueryInstanceConsumeRequest {
    /**
     * 账单开始时间，YYYY－MM-DD，支持当前月，不支持跨月。
     */
    @KsYunField(name = "StartDay")
    private String StartDay;

    /**
     * 账单结束时间，YYYY－MM-DD，支持当前月，不支持跨月。
     */
    @KsYunField(name="EndDay")
    private String EndDay;

    /**
     * 可选参数，产品线对应的Code。eg. KEC，默认获取所有产品线的账单，取值可以参考 获取产品线列表  金山云-文档中心-获取产品线列表 (ksyun.com)
     */
    @KsYunField(name="ProductCode")
    private String ProductCode;

    /**第几页,默认值为1
*/
    @KsYunField(name = "Page")
    private Integer Page;

    /**每页条数,默认值20，最大值200
*/
    @KsYunField(name="Size")
    private Integer Size;

}