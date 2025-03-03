package ksyun.client.knad.modifyknad.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyKnadRequest
 * @Description 请求参数
 */
@Data
public class ModifyKnadRequest {
    /**
     * 服务套餐ID
     */
    @KsYunField(name = "ServiceId")
    private String ServiceId;

    /***/
    @KsYunField(name = "IpCount")
    private Integer IpCount;

    /***/
    @KsYunField(name = "KnadId")
    private String KnadId;

    /**
     * 防护能力
     */
    @KsYunField(name = "Band")
    private Integer Band;

    /**
     * 防护能力上限。（Band不为空时候必传）
     */
    @KsYunField(name = "MaxBand")
    private Integer MaxBand;

    /**
     * 带宽
     */
    @KsYunField(name = "IdcBand")
    private Integer IdcBand;

}