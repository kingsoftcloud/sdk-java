package ksyun.client.pdns.deleterecord.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteRecordRequest
* @Description 请求参数
*/
@Data
public class DeleteRecordRequest{
    /**Action*/
    @KsYunField(name="Action")
    private String Action;


}