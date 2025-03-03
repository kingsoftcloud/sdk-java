package ksyun.client.kce.registerrepositoryaccount.v20180314;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RegisterRepositoryAccountRequest
 * @Description 请求参数
 */
@Data
public class RegisterRepositoryAccountRequest {
    /**
     * 镜像仓库密码，限制：8-32个字符，必须包含字母、数字和特殊字符中至少两项，支持英文特殊字符!$%()*+,-./:;<=>?@[]^_`{&#124;}~
     */
    @KsYunField(name = "Password")
    private String Password;


}