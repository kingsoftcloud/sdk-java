package ksyun.client.knad.createknad.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateKnadRequest
 * @Description 请求参数
 */
@Data
public class CreateKnadRequest {
    /**
     * 套餐id
     */
    @KsYunField(name = "ServiceId")
    private String ServiceId;

    /**
     * 高防实例名称
     */
    @KsYunField(name = "KnadName")
    private String KnadName;

    /**
     * 购买时长，当计费方式是固定计费时，单位为月，最小值为1。包年包月时必传，按日月结可不传
     */
    @KsYunField(name = "Duration")
    private Integer Duration;

    /**
     * 项目制id
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**
     * 防护能力
     */
    @KsYunField(name = "Band")
    private Integer Band;

    /**
     * 最大防护能力
     */
    @KsYunField(name = "MaxBand")
    private Integer MaxBand;

    /**
     * 可绑ip数
     */
    @KsYunField(name = "IpCount")
    private Integer IpCount;

    /**
     * 计费方式：1 (包年包月)；5(按日月接)
     */
    @KsYunField(name = "BillType")
    private Integer BillType;

    /**
     * 带宽
     */
    @KsYunField(name = "IdcBand")
    private Integer IdcBand;

}