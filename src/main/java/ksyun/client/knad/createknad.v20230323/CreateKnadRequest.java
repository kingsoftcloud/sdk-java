package ksyun.client.knad.createknad.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateKnadRequest
* @Description 请求参数
*/
@Data
public class CreateKnadRequest{
    /**原生高防套餐，即保底防护带宽*/
    @KsYunField(name="ServiceId")
    private String ServiceId;

    /**原生高防实例名称*/
    @KsYunField(name="KnadName")
    private String KnadName;

    /**购买时长，单位月
示例值：当计费类型为包年包月时，有效值1-36；其他计费类型时，强制要求参数值为0*/
    @KsYunField(name="Duration")
    private Integer Duration;

    /**实例所属项目ID
示例值：账户有权限的项目ID，0为默认项目*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**基础防护能力，与套餐的大小保持一致
示例值：套餐为KNAD_2000G，band值为：2000*/
    @KsYunField(name="Band")
    private Integer Band;

    /**弹性防护上限，攻击峰值超过保底防护的最大防护能力，取值为：
套餐KNAD_2000G：2000
套餐KNAD_1000G：1000、2000
套餐KNAD_300G：300-1000以100阶梯取值、2000
套餐KNAD_100G：100-1000以100阶梯取值
套餐KNAD_30G：30-100以10阶梯取值、100-600以100阶梯取值*/
    @KsYunField(name="MaxBand")
    private Integer MaxBand;

    /**可防护ip数，取值范围：10-100*/
    @KsYunField(name="IpCount")
    private Integer IpCount;

    /**计费方式：1 (包年包月)；5(按量付费（按日月结)）*/
    @KsYunField(name="BillType")
    private Integer BillType;

    /**清洗后正常业务带宽大小，取值范围：100-15000*/
    @KsYunField(name="IdcBand")
    private Integer IdcBand;

}
