package ksyun.client.pdns.createzone.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateZoneRequest
* @Description 请求参数
*/
@Data
public class CreateZoneRequest{
    /**Action*/
    @KsYunField(name="Action")
    private String Action;

    /**Version*/
    @KsYunField(name="Version")
    private String Version;

    /**ZoneName*/
    @KsYunField(name="ZoneName")
    private String ZoneName;

    /**ZoneTtl*/
    @KsYunField(name="ZoneTtl")
    private Integer ZoneTtl;

}
