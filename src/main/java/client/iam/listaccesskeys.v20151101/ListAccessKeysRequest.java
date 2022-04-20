package client.iam.listaccesskeys.v20151101;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListAccessKeysRequest
* @Description 请求参数
*/
@Data
public class ListAccessKeysRequest{
    /**IAM子用户名*/
    @KsYunField(name="UserName")
    private String UserName;


}