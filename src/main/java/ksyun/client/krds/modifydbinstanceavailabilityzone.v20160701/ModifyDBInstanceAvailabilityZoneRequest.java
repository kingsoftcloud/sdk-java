package ksyun.client.krds.modifydbinstanceavailabilityzone.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyDBInstanceAvailabilityZoneRequest
* @Description 请求参数
*/
@Data
public class ModifyDBInstanceAvailabilityZoneRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**主可用区	主所在可用区不可变*/
    @KsYunField(name="AvailabilityZone.1")
    private String AvailabilityZone1;

    /**备可用区*/
    @KsYunField(name="AvailabilityZone.2")
    private String AvailabilityZone2;


}