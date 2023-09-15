package ksyun.client.krds.renewdbinstance.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RenewDBInstanceRequest
* @Description 请求参数
*/
@Data
public class RenewDBInstanceRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**时长*/
    @KsYunField(name="Duration")
    private Integer Duration;

    /**时长单位*/
    @KsYunField(name="DurationUnit")
    private String DurationUnit;

    /**计费方式	默认值：YEAR_MONTH，取值范围：YEAR_MONTH（包年包月）,DAY（按日计费）。*/
    @KsYunField(name="BillType")
    private String BillType;

    /**结束时间	该参数按日计费时有效。默认值：NULL，填入日期（如：2018-03-22）代表服务结束时间。*/
    @KsYunField(name="EndTime")
    private String EndTime;


}