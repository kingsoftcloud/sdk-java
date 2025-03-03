package ksyun.client.kcs.describecachedefaultparameters.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCacheDefaultParametersRequest
 * @Description 请求参数
 */
@Data
public class DescribeCacheDefaultParametersRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 参数组版本 ，默认是2.8版本。 可选2.8，3.0，4.0，5.0，6.0
     */
    @KsYunField(name = "ParamVersion")
    private String ParamVersion;

}