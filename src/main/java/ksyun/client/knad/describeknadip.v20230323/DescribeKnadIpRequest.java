package ksyun.client.knad.describeknadip.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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