package ksyun.client.kcm.updatecertificate.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateCertificateRequest
* @Description 请求参数
*/
@Data
public class UpdateCertificateRequest{
    /**证书ID*/
    @KsYunField(name="CertificateId")
    private String CertificateId;

    /**验证方式，可选值：DNS 、 FILE， 不填默认值为：DNS*/
    @KsYunField(name="AuthMethod")
    private String AuthMethod;

    /**证书CSR字符串，当CsrSource为USER或缺省时，此值不可缺省*/
    @KsYunField(name="CSR")
    private String CSR;

    /**联系人ID，当ContactId不为空时，Contact参数可缺省，两者并存时以ContactId为准，当ContactId为空时，City、State、Country都不能为空*/
    @KsYunField(name="ContactId")
    private Integer ContactId;

    /**企业信息ID，当CompanyId不为空时，CompanyName、Department、State、City、Address、CompanyPhone、PostalCode可缺省，两者并存时以CompanyId为准*/
    @KsYunField(name="CompanyId")
    private Integer CompanyId;

    /**企业名称*/
    @KsYunField(name="CompanyName")
    private String CompanyName;

    /**部门名称*/
    @KsYunField(name="Department")
    private String Department;

    /**省份*/
    @KsYunField(name="State")
    private String State;

    /**城市*/
    @KsYunField(name="City")
    private String City;

    /**地址*/
    @KsYunField(name="Address")
    private String Address;

    /**公司电话，可为座机或者手机*/
    @KsYunField(name="CompanyPhone")
    private String CompanyPhone;

    /**邮编*/
    @KsYunField(name="PostalCode")
    private String PostalCode;

    /**可从whois查询到的注册域名时填写的邮箱信息*/
    @KsYunField(name="DcvEmail")
    private String DcvEmail;

    /**附加域名,多个域名以英文,分隔*/
    @KsYunField(name="AdditionalDomains")
    private String AdditionalDomains;

    /**通配符域名,多个通配符域名以英文,分隔*/
    @KsYunField(name="Wildcards")
    private String Wildcards;

    /**联系人,DV证书只需要技术联系人,如果Contactid为空， Contact不可缺省*/
    @KsYunField(name="Contact")
    private String Contact;

    /**是否提交，提交后将把订单数据提交给第三方，可选值0 否|1 是

约束：
- 当值为0时：
可以用来修改Contact、CompanyName、State、City、Address、CompanyPhone、PostalCode、Department等信息；
- 当值为1时：
  - 必须保证Contact不为空
  - 且CompanyName、State、City、Address、CompanyPhone、PostalCode、Department不为空，或在IsSubmit为0时已经设置过
  - 对于DV证书，以上规则有两个例外
     - Department可为空
     - CompanyPhone可为空，但contact当中必须设置phone*/
    @KsYunField(name="IsSubmit")
    private String IsSubmit;

    /**企业营业执照图片文件，图片的base64值，图片大小不超过600K*/
    @KsYunField(name="BusinessLicence")
    private String BusinessLicence;

    /**CSR字符串来源
- 约束
  - IsSubmit为0时，此参数可缺省
  - IsSubmit为1时
     - 当值为USER时，参数CSR不可缺省或此前在IsSubmit为0时设置过；
     - 当值为SYSTEM时，CSR参数或此前设置的CSR无效*/
    @KsYunField(name="CsrSource")
    private String CsrSource;

    /**编码算法类型，可选值

- ECC
- RSA 默认值*/
    @KsYunField(name="Algorithm")
    private String Algorithm;

    /**证书签名算法。可选值

SHA256-FULLCHAIN
SHA2-256 默认值*/
    @KsYunField(name="CertSignature")
    private String CertSignature;

}
