package com.jeecms.common.wechat.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link}https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&t=
 * resource/res_list&verify=1&id=open1419318634&token=&lang=zh_CN
 * 
 * @Description: 微信开放平台接口全局返回码.
 * @author: wangqq
 * @date: 2018年7月25日 上午10:07:30
 * @Copyright: 江西金磊科技发展有限公司 All rights reserved. Notice
 *             仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
public class OpenReturnCode {

	@SuppressWarnings("serial")
	private static final Map<Integer, String> ERR_CODE_TO_ERR_MSG = new HashMap<Integer, String>() {
		{
			put(-1, "系统繁忙");
			put(0, "请求成功");
			put(40001, "获取access_token时AppSecret错误，或者access_token无效");
			put(40002, "不合法的凭证类型");
			put(40003, "不合法的OpenID");
			put(40004, "不合法的媒体文件类型");
			put(40005, "不合法的文件类型");
			put(40006, "不合法的文件大小");
			put(40007, "不合法的媒体文件id");
			put(40008, "不合法的消息类型");
			put(40009, "不合法的图片文件大小");
			put(40010, "不合法的语音文件大小");
			put(40011, "不合法的视频文件大小");
			put(40012, "不合法的缩略图文件大小");
			put(40013, "不合法的APPID");
			put(40014, "不合法的access_token");
			put(40015, "不合法的菜单类型");
			put(40016, "不合法的按钮个数");
			put(40017, "不合法的按钮类型");
			put(40018, "不合法的按钮名字长度");
			put(40019, "不合法的按钮KEY长度");
			put(40020, "不合法的按钮URL长度");
			put(40021, "不合法的菜单版本号");
			put(40022, "不合法的子菜单级数");
			put(40023, "不合法的子菜单按钮个数");
			put(40024, "不合法的子菜单按钮类型");
			put(40025, "不合法的子菜单按钮名字长度");
			put(40026, "不合法的子菜单按钮KEY长度");
			put(40027, "不合法的子菜单按钮URL长度");
			put(40028, "不合法的自定义菜单使用用户");
			put(40029, "不合法的oauth_code");
			put(40030, "不合法的refresh_token");
			put(40031, "不合法的openid列表");
			put(40032, "不合法的openid列表长度,一次只能拉黑20个用户");
			put(40035, "不合法的参数");
			put(40037, "不合法的模板id");
			put(40038, "不合法的请求格式");
			put(40039, "不合法的URL长度");
			put(40050, "不合法的分组id");
			put(40051, "分组名字不合法");
			put(40053, "不合法的actioninfo，请开发者确认参数正确");
			put(40056, "不合法的Code码");
			put(40059, "不合法的消息id");
			put(40066, "不合法的URL");
			put(40071, "不合法的卡券类型");
			put(40072, "不合法的编码方式");
			put(40078, "card_id未授权");
			put(40079, "不合法的时间");
			put(40080, "不合法的CardExt");
			put(40097, "参数不正确，请参考字段要求检查json字段");
			put(40099, "卡券已被核销");
			put(40100, "不合法的时间区间");
			put(40116, "不合法的Code码");
			put(40122, "不合法的库存数量");
			put(40124, "会员卡设置查过限制的 custom_field字段");
			put(40127, "卡券被用户删除或转赠中");
			put(40130, "不合法的openid列表长度, 长度至少大于2个");
			put(41001, "缺少access_token参数");
			put(41002, "缺少appid参数");
			put(41003, "缺少refresh_token参数");
			put(41004, "缺少secret参数");
			put(41005, "缺少多媒体文件数据");
			put(41006, "缺少media_id参数");
			put(41007, "缺少子菜单数据");
			put(41008, "缺少oauth code");
			put(41009, "缺少openid");
			put(41011, "缺少必填字段");
			put(41012, "缺少cardid参数");
			put(42001, "access_token超时");
			put(42002, "refresh_token超时");
			put(42003, "oauth_code超时");
			put(43001, "需要GET请求");
			put(43002, "需要POST请求");
			put(43003, "需要HTTPS请求");
			put(43004, "需要接收者关注");
			put(43005, "需要好友关系");
			put(43009, "自定义SN权限，请前往公众平台申请");
			put(43010, "无储值权限，请前往公众平台申请");
			put(43100, "修改模板所属行业太频繁");
			put(44001, "多媒体文件为空");
			put(44002, "POST的数据包为空");
			put(44003, "图文消息内容为空");
			put(44004, "文本消息内容为空");
			put(45001, "多媒体文件大小超过限制");
			put(45002, "消息内容超过限制");
			put(45003, "标题字段超过限制");
			put(45004, "描述字段超过限制");
			put(45005, "链接字段超过限制");
			put(45006, "图片链接字段超过限制");
			put(45007, "语音播放时间超过限制");
			put(45008, "图文消息超过限制");
			put(45009, "接口调用超过限制");
			put(45010, "创建菜单个数超过限制");
			put(45015, "回复时间超过限制");
			put(45016, "系统分组，不允许修改");
			put(45017, "分组名字过长");
			put(45018, "分组数量超过上限");
			put(45027, "模板与所选行业不符");
			put(45028, "没有群发配额");
			put(45030, "该cardid无接口权限");
			put(45031, "库存为0");
			put(45033, "用户领取次数超过限制get_limit");
			put(45056, "创建的标签数过多，请注意不能超过100个");
			put(45057, "该标签下粉丝数超过10w，不允许直接删除");
			put(45058, "不能修改0/1/2这三个系统默认保留的标签");
			put(45059, "有粉丝身上的标签数已经超过限制");
			put(45157, "标签名非法，请注意不能和其他标签重名");
			put(45158, "标签名长度超过30个字节");
			put(45159, "非法的tag_id");
			put(46001, "不存在媒体数据");
			put(46002, "不存在的菜单版本");
			put(46003, "不存在的菜单数据");
			put(46004, "不存在的用户");
			put(46005, "不存在的门店");
			put(47001, "解析JSON/XML内容错误");
			put(48001, "api功能未授权");
			put(48004, "api接口被封禁，请登录mp.weixin.qq.com查看详情");
			put(48005, "禁止删除自动回复或菜单使用的素材");
			put(49003, "传入的openid不属于此AppID");
			put(50001, "用户未授权该api");
			put(50002, "用户受限，可能是违规后接口被封禁");
			put(53010, "名称格式不合法");
			put(53011, "名称检测命中频率限制");
			put(53012, "禁止使用该名称");
			put(53013, "公众号：名称与已有公众号名称重复;小程序：该名称与已有小程序名称重复");
			put(53014, "公众号：公众号已有{名称A+}时，需与该帐号相同主体才可申请{名称A};小程序：小程序已有{名称A+}时，需与该帐号相同主体才可申请{名称A}");
			put(53015, "公众号：该名称与已有小程序名称重复，需与该小程序帐号相同主体才可申请;小程序：该名称与已有公众号名称重复，需与该公众号帐号相同主体才可申请");
			put(53016, "公众号：该名称与已有多个小程序名称重复，暂不支持申请;小程序：该名称与已有多个公众号名称重复，暂不支持申请");
			put(53017, "公众号：小程序已有{名称A+}时，需与该帐号相同主体才可申请{名称A};小程序：公众号已有{名称A+}时，需与该帐号相同主体才可申请{名称A}");
			put(53018, "名称命中微信号");
			put(53019, "名称在保护期内");
			put(53200, "本月功能介绍修改次数已用完");
			put(53201, "功能介绍内容命中黑名单关键字");
			put(53202, "本月头像修改次数已用完");
			put(53300, "超出每月次数限制");
			put(53301, "超出可配置类目总数限制");
			put(53302, "当前账号主体类型不允许设置此种类目");
			put(53303, "提交的参数不合法");
			put(53304, "与已有类目重复");
			put(53305, "包含未通过IPC校验的类目");
			put(53306, "修改类目只允许修改类目资质，不允许修改类目ID");
			put(53307, "只有审核失败的类目允许修改");
			put(53308, "审核中的类目不允许删除");
			put(61005, "微信开放平台配置错误");
			put(61451, "参数错误");
			put(61452, "无效客服账号");
			put(61453, "客服帐号已存在");
			put(61454, "客服帐号名长度超过限制(仅允许10个英文字符，不包括@及@后的公众号的微信号)");
			put(61455, "客服帐号名包含非法字符(仅允许英文+数字)");
			put(61456, "客服帐号个数超过限制(10个客服账号)");
			put(61457, "无效头像文件类型");
			put(61450, "系统错误");
			put(61500, "日期格式错误");
			put(65104, "门店的类型不合法，必须严格按照附表的分类填写");
			put(65105, "图片url 不合法，必须使用接口1 的图片上传接口所获取的url");
			put(65106, "门店状态必须未审核通过");
			put(65107, "扩展字段为不允许修改的状态");
			put(65109, "门店名为空");
			put(65110, "门店所在详细街道地址为空");
			put(65111, "门店的电话为空");
			put(65112, "门店所在的城市为空");
			put(65113, "门店所在的省份为空");
			put(65114, "图片列表为空");
			put(65115, "poi_id 不正确");
			put(65301, "不存在此menuid对应的个性化菜单");
			put(65302, "没有相应的用户");
			put(65303, "没有默认菜单，不能创建个性化菜单");
			put(65304, "MatchRule信息为空");
			put(65305, "个性化菜单数量受限");
			put(65306, "不支持个性化菜单的帐号");
			put(65307, "个性化菜单信息为空");
			put(65308, "包含没有响应类型的button");
			put(65309, "个性化菜单开关处于关闭状态");
			put(65310, "填写了省份或城市信息，国家信息不能为空");
			put(65311, "填写了城市信息，省份信息不能为空");
			put(65312, "不合法的国家信息");
			put(65313, "不合法的省份信息");
			put(65314, "不合法的城市信息");
			put(65316, "该公众号的菜单设置了过多的域名外跳（最多跳转到3个域名的链接）");
			put(65317, "不合法的URL");
			put(65400, "API不可用，即没有开通/升级到新客服功能");
			put(65401, "无效客服帐号");
			put(65402, "帐号尚未绑定微信号，不能投入使用");
			put(65403, "客服昵称不合法");
			put(65404, "客服帐号不合法");
			put(65405, "帐号数目已达到上限，不能继续添加");
			put(65406, "已经存在的客服帐号");
			put(65407, "邀请对象已经是本公众号客服");
			put(65408, "本公众号已发送邀请给该微信号");
			put(65409, "无效的微信号");
			put(65410, "邀请对象绑定公众号客服数量达到上限（目前每个微信号最多可以绑定5个公众号客服帐号）");
			put(65411, "该帐号已经有一个等待确认的邀请，不能重复邀请");
			put(65412, "该帐号已经绑定微信号，不能进行邀请");
			put(65413, "不存在对应用户的会话信息");
			put(65414, "客户正在被其他客服接待");
			put(65415, "客服不在线");
			put(65416, "查询参数不合法");
			put(65417, "查询时间段超出限制");
			put(72015, "没有操作发票的权限，请检查是否已开通相应权限。");
			put(72017, "发票抬头不一致");
			put(72023, "发票已被其他公众号锁定");
			put(72024, "发票状态错误");
			put(72025, "wx_invoice_token无效");
			put(72028, "未设置微信支付商户信息");
			put(72029, "未设置授权字段");
			put(72030, "mchid无效");
			put(72031, "参数错误。可能为请求中包括无效的参数名称或包含不通过后台校验的参数值");
			put(72035, "发票已经被拒绝开票");
			put(72036, "发票正在被修改状态，请稍后再试");
			put(72038, "订单没有授权，可能是开票平台appid、商户appid、订单order_id不匹配");
			put(72039, "订单未被锁定");
			put(72040, "Pdf无效，请提供真实有效的pdf");
			put(72042, "发票号码和发票代码重复");
			put(72043, "发票号码和发票代码错误");
			put(72044, "发票抬头二维码超时");
			put(85001, "微信号不存在或微信号设置为不可搜索");
			put(85002, "小程序绑定的体验者数量达到上限");
			put(85003, "微信号绑定的小程序体验者达到上限");
			put(85004, "微信号已经绑定");
			put(85006, "标签格式错误");
			put(85007, "页面路径错误");
			put(85008, "类目填写错误");
			put(85009, "已经有正在审核的版本");
			put(85010, "item_list有项目为空");
			put(85011, "标题填写错误");
			put(85012, "无效的审核id");
			put(85013, "无效的自定义配置");
			put(85014, "无效的模版编号");
			put(85015, "该账号不是小程序账号");
			put(85016, "域名数量超过限制");
			put(85017, "没有新增域名，请确认小程序已经添加了域名或该域名是否没有在第三方平台添加");
			put(85018, "域名没有在第三方平台设置");
			put(85019, "没有审核版本");
			put(85020, "审核状态未满足发布");
			put(85021, "状态不可变");
			put(85022, "action非法");
			put(85023, "审核列表填写的项目数不在1-5以内");
			put(85026, "微信号绑定管理员名额达到上限");
			put(85027, "身份证绑定管理员名额达到上限");
			put(85043, "模版错误");
			put(85044, "代码包超过大小限制");
			put(85045, "ext_json有不存在的路径");
			put(85046, "tabBar中缺少path");
			put(85047, "pages字段为空");
			put(85048, "ext_json解析失败");
			put(85060, "无效的taskid");
			put(85061, "手机号绑定管理员名额达到上限");
			put(85062, "手机号黑名单");
			put(85063, "身份证黑名单");
			put(85064, "找不到模版");
			put(85065, "模版库已满");
			put(85066, "链接错误");
			put(85068, "测试链接不是子链接");
			put(85069, "校验文件失败");
			put(85070, "链接为黑名单");
			put(85071, "已添加该链接，请勿重复添加");
			put(85072, "该链接已被占用");
			put(85073, "二维码规则已满");
			put(85074, "小程序未发布, 小程序必须先发布代码才可以发布二维码跳转规则");
			put(85075, "个人类型小程序无法设置二维码规则");
			put(85076, "链接没有ICP备案");
			put(85077, "小程序类目信息失效（类目中含有官方下架的类目，请重新选择类目）");
			put(85079, "小程序没有线上版本，不能进行灰度");
			put(85080, "小程序提交的审核未审核通过");
			put(85081, "无效的发布比例");
			put(85082, "当前的发布比例需要比之前设置的高");
			put(85083, "搜索标记位被封禁，无法修改");
			put(85084, "非法的status值，只能填0或者1");
			put(85085, "近7天提交审核的小程序数量过多，请耐心等待审核完毕后再次提交");
			put(85086, "提交代码审核之前需提前上传代码");
			put(85087, "小程序已使用api navigateToMiniProgram，请声明跳转appid列表后再次");
			put(86000, "不是由第三方代小程序进行调用");
			put(86001, "不存在第三方的已经提交的代码");
			put(86002, "小程序还未设置昵称、头像、简介。请先设置完后再重新提交");
			put(87011, "现网已经在灰度发布，不能进行版本回退");
			put(87012, "该版本不能回退，可能的原因：1:无上一个线上版用于回退 2:此版本为已回退版本，不能回退 3:此版本为回退功能上线之前的版本，不能回退");
			put(87013, "撤回次数达到上限（每天一次，每个月10次）");
			put(88000, "没有留言权限");
			put(89000, "account has bound open ，该公众号 / 小程序 已经绑定了开放平台帐号");
			put(89001, "not same contractor，Authorizer与开放平台帐号主体不相同");
			put(89003, "该开放平台帐号并非通过api创建，不允许操作");
			put(89004, "该开放平台帐号所绑定的公众号/小程序已达上限（100个）");
			put(89019, "业务域名无更改，无需重复设置");
			put(89020, "尚未设置小程序业务域名，请先在第三方平台中设置小程序业务域名后在调用本接口");
			put(89021, "请求保存的域名不是第三方平台中已设置的小程序业务域名或子域名");
			put(89029, "业务域名数量超过限制");
			put(89231, "个人小程序不支持调用setwebviewdomain接口");
			put(89236, "该插件不能申请");
			put(89237, "已经添加该插件");
			put(89238, "申请或使用的插件已经达到上限");
			put(89239, "该插件不存在");
			put(89243, "该申请为“待确认”状态，不可删除");
			put(89244, "不存在该插件appid");
			put(91001, "不是公众号快速创建的小程序");
			put(91002, "小程序发布后不可改名");
			put(91003, "改名状态不合法");
			put(91004, "昵称不合法");
			put(91005, "昵称命中主体保护");
			put(91006, "昵称命中微信号");
			put(91007, "昵称已被占用");
			put(91008, "昵称命中7天侵权保护期");
			put(91009, "需要提交材料");
			put(91010, "其他错误");
			put(91011, "查不到昵称修改审核单信息");
			put(91012, "其它错误");
			put(9001001, "POST数据参数不合法");
			put(9001002, "远端服务不可用");
			put(9001003, "Ticket不合法");
			put(9001004, "获取摇周边用户信息失败");
			put(9001005, "获取商户信息失败");
			put(9001006, "获取OpenID失败");
			put(9001007, "上传文件缺失");
			put(9001008, "上传素材的文件类型不合法");
			put(9001009, "上传素材的文件尺寸不合法");
			put(9001010, "上传失败");
			put(9001020, "帐号不合法");
			put(9001021, "已有设备激活率低于50%，不能新增设备");
			put(9001022, "设备申请数不合法，必须为大于0的数字");
			put(9001023, "已存在审核中的设备ID申请");
			put(9001024, "一次查询设备ID数量不能超过50");
			put(9001025, "设备ID不合法");
			put(9001026, "页面ID不合法");
			put(9001027, "页面参数不合法");
			put(9001028, "一次删除页面ID数量不能超过10");
			put(9001029, "页面已应用在设备中，请先解除应用关系再删除");
			put(9001030, "一次查询页面ID数量不能超过50");
			put(9001031, "时间区间不合法");
			put(9001032, "保存设备与页面的绑定关系参数错误");
			put(9001033, "门店ID不合法");
			put(9001034, "设备备注信息过长");
			put(9001035, "设备申请参数不合法");
			put(9001036, "查询起始值begin不合法");
		}
	};

	/**
	 * 通过返回码获取返回信息.
	 *
	 * @param errCode
	 *            错误码
	 * @return {String}
	 */
	public static String get(int errCode) {
		return ERR_CODE_TO_ERR_MSG.get(errCode);
	}
}