package ksyun.client.knad.describeknadip.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeKnadIpRequest
 * @Description 请求参数
 */
@Data
public class DescribeKnadIpRequest {
    /**
     * 高防实例id
     */
    @KsYunField(name = "KnadId")
    private String KnadId;

    /**
     * 每页条数
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

    /***/
    @KsYunField(name = "OffSet")
    private Integer OffSet;

}