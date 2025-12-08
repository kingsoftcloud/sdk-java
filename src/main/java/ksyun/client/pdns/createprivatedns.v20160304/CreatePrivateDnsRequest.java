package ksyun.client.pdns.createprivatedns.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreatePrivateDnsRequest
* @Description 请求参数
*/
@Data
public class CreatePrivateDnsRequest{
    /**Action*/
    @KsYunField(name="Action")
    private String Action;

    /**Version*/
    @KsYunField(name="Version")
    private String Version;

    /**项目ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

}
