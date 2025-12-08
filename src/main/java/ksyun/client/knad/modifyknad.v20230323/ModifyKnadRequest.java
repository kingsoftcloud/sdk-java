package ksyun.client.knad.modifyknad.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyKnadRequest
* @Description 请求参数
*/
@Data
public class ModifyKnadRequest{
    /**待调整防护能力的实例ID*/
    @KsYunField(name="KnadId")
    private String KnadId;

    /**目标原生高防套餐，即保底防护带宽*/
    @KsYunField(name="ServiceId")
    private String ServiceId;

    /**目标可防护ip数，取值范围：10-100*/
    @KsYunField(name="IpCount")
    private Integer IpCount;

    /**基础防护能力，与套餐的大小保持一致
示例值：套餐为KNAD_2000G，band值为：2000*/
    @KsYunField(name="Band")
    private Integer Band;

    /**弹性防护上限，攻击峰值超过保底防护的最大防护能力（Band不为空时候必传）
取值为：
套餐KNAD_2000G：2000
套餐KNAD_1000G：1000、2000
套餐KNAD_300G：300-1000以100阶梯取值、2000
套餐KNAD_100G：100-1000以100阶梯取值
套餐KNAD_30G：30-100以10阶梯取值、100-600以100阶梯取值*/
    @KsYunField(name="MaxBand")
    private Integer MaxBand;

    /**清洗后正常业务带宽大小，取值范围：100-15000*/
    @KsYunField(name="IdcBand")
    private Integer IdcBand;

}
