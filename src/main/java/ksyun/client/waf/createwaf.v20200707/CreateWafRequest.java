package ksyun.client.waf.createwaf.v20200707;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateWafRequest
 * @Description 请求参数
 */
@Data
public class CreateWafRequest {
    /**
     * 套餐类型，可取值：WAF_basic（高级版）、WAF_pro（企业版）
     */
    @KsYunField(name = "WafType")
    private String WafType;

    /**
     * 计费类型包括“包年包月”和“按日月结”，可取值：1（包年包月）、5（按日月结）
     */
    @KsYunField(name = "BillType")
    private Integer BillType;

    /**
     * 购买时长，可取值1-36，如果计费方式为包年包月，则必须传递此参数
     */
    @KsYunField(name = "PurchaseTime")
    private Integer PurchaseTime;

    /**
     * 域名包数量，可取值：1-500
     */
    @KsYunField(name = "DomainBag")
    private Integer DomainBag;

    /**
     * waf实例的带宽，可取值：高级版10-5000、企业版30-5000
     */
    @KsYunField(name = "BandWidthIpv4")
    private Integer BandWidthIpv4;

    /**
     * 日志存储容量，可选值：1-100单位：TB
     */
    @KsYunField(name = "StorageSize")
    private Integer StorageSize;

    /**
     * 项目制id
     */
    @KsYunField(name = "ProjectId")
    private Integer ProjectId;

}