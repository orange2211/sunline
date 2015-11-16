package com.sunline.rdp.util;
public class RdpConstantPara
	{
		public static String CONSOLE_SERVLET_NAME ="/RdpServlet/RdpConsole";
		public static String UPFILE_SERVLET_NAME ="/RdpServlet/RdpFileConsole";
		 
		public static String CONFIG_ERROR_PRE ="RDPERROR";
		public static String STRING_TRUE ="1";
		public static String STRING_FALSE ="0";
		
		public static String DEFAULT_USERID ="rdp";
		public static String DEFAULT_ENTITYID ="rdp";
		public static String DEFAULT_PASSWORD ="rdp";
		public static String DEFAULT_TASKID ="rdp";
		
		public static int MAX_CYCLE_COUNT =1000;

		public static String MENU_TASK_SPLIT =";";
		public static String MENU_TASK_DESC_SPLIT ="|";
		
		//public static String RETCODE_SUCCESS ="0000";
		public static String RETCODE_SUCCESS ="AAAAAAAAAA";
		
		public static String XML_HEADER ="<?xml version=\"1.0\" encoding=\"utf-8\"?>";
		public static String XML_ROOT_BEGIN ="<root>";
		public static String XML_ROOT_END ="</root>";
		
		public static int GRDI_DEFAULT_ROWS =20;
		
		public static int FIELD_TEXT_HEIGHT =100;
		//public static String FIELD_NORMAL_LENGTH:int=220;
		//public static String FIELD_LONG_LENGTH:int=565;
		//public static String LABEL_NORMAL_LENGTH:int=120;
		//public static String BUTTON_NORMAL_LENGTH:int=40;/*附加按钮栏位*/
		//public static String GRID_NORMAL_LENGTH:int=565;
		public static String MENU_ATTRIBUTE_MAIN ="MAIN";
		public static String MENU_ATTRIBUTE_EXTEND ="EXTEND";
		public static String MENU_ATTRIBUTE_HEADER ="HEADER";
		public static String MENU_ATTRIBUTE_SPLIT ="***";
		public static String MENU_ATTRIBUTE_PARA ="PARA";
		public static String MENU_ATTRIBUTE_PRODUCT ="PRODUCT";
		
		public static String MENU_NAME_SPLIT ="=";
		
		public static String MENU_TYPE_SPLIT ="|";
		public static String MENU_SPLIT ="*$##@!";		
		public static String PARA_SPLIT ="*$$*!!##@*";
		public static String PARA_SELF_SPLIT ="**!!@*";
		public static String FIELD_ERROR_VALUE ="ERROR99";
		
		//针对CL数据字典和列表中的.处理，mxml中不能有.
		public static String DOTREPLACE ="#$*";

		public static int MAX_TAB_CHILD =8;
		public static String FIELD_LABEL_SUFFIX ="_LBL";
		
		
		public static String APPL_PAGE_VBOX ="pageVBox";
		public static String APPL_SYS_TASK_LABEL ="SYS_TASK_LABEL";
		public static String APPL_PAGE_TAB ="pageTab";
		public static String APPL_PAGE_TREETAB ="pageTreeTab";
		public static String APPL_PAGE_RIGHT_HBOX ="righttaskhbox";
		public static String APPL_PAGE_LEFT_HBOX ="lefttaskhbox";
		public static String APPL_PARA_PAGE_TAB ="para_maintenance";
		public static String APPL_TREE_LEFT_PANEL ="treeLeftPanel";
		public static String APPL_PAGE_BTNCONFIRM ="btnConfirm";
		public static String APPL_PAGE_BTNCANCEL ="btnCancel";
		public static String APPL_PAGEEVENTPERFORM_VARNAME ="pageEventPerform";
		public static String APPL_GRIDEVENTPERFORM_VARNAME ="gridEventPerform";
		public static String APPL_SETTINGEVENTPERFORM_VARNAME ="settingPageEventPerform";
		public static String APPL_FILTEREVENTPERFORM_VARNAME ="filterPageEventPerform";
		public static String APPL_PAGESCRIPT_VARNAME ="pageScript";
		public static String APPL_INIT_FUNCNAME ="initTrx";
		
		public static String FORM_LINE_NOTEPRE ="#";
		public static String NORMAL_CENTER ="\n";
		
		public static String DEFAULT_PARA_SPLIT ="$";
		public static String DEFAULT_VALUE_SPLIT ="=";	
		
		public static String COMM_SPLIT =",";
		public static int GRID_COLUMN_WIDTH =150;
		
		public static String AMT_SPLIT =",";
		public static String FORMAT_AMT ="amount";
		public static String FORMAT_RATE ="rate";
		public static String FORMAT_TIME ="time";
		public static String FORMAT_PASSWORD ="password";
		public static String FORMAT_DATE ="date";
		public static String FORMAT_FLOAT ="float";
		public static String FORMAT_INT ="int";
		public static String FORMAT_LIST ="list";
		
		public static String SYNC_TYPE_ALL ="all";
		public static String SYNC_TYPE_TELLER ="teller";
		
		public static int AFTER_LOCK_TIME =1000;//毫秒	
		public static String FRONT_RETURN_SPLIT ="|";
		
		//系统布局代码
		public static String SYSTEMLAYOUTID_CORE ="core";//交易系统
		public static String SYSTEMLAYOUTID_CONFIG ="config";//参数配置
		public static String SYSTEMLAYOUTID_ACCOUNT ="account";//会计系统
		
		//默认系统
		public static String SYSTEMID_DEFAULT ="core";
		public static String SYSTEMID_ACCOUNT ="account";//会计系统
		
		//系统名称
		public static String PANELNAME_LOGIN ="login";//登录窗体
		public static String PANELNAME_ENTRY ="entry";//入口窗体
		public static String PANELNAME_LOCK ="lock";//锁屏窗体	
		public static String PANELNAME_SYSTEM ="system";//系统窗体	
		
		public static String RESOURCELOADTYPE_HTTP ="http";
		public static String RESOURCELOADTYPE_CLASS ="class";
		
		public static String RESOURCE_LISTXMLDATA_VARNAME ="listXmlData";
		public static String RESOURCE_DICTXMLDATA_VARNAME ="dictXmlData";
		public static String RESOURCE_RADIOXMLDATA_VARNAME ="radioXmlData";
		public static String RESOURCE_CHECKBOXXMLDATA_VARNAME ="checkboxXmlData";
		public static String RESOURCE_TASKXMLDATA_VARNAME ="taskXmlData";
		public static String RESOURCE_MENUXMLDATA_VARNAME ="menuXmlData";
		
		//系统状态
		public static String SYSTEMSTATUS_POC ="poc";
		public static String SYSTEMSTATUS_DEV ="dev";
		public static String SYSTEMSTATUS_TEST ="test";
		public static String SYSTEMSTATUS_RUN ="run";
		
		/*输入类型控制*/
		public static String INPUT_NUMBER ="number";
		public static String INPUT_CHAR ="char";
		public static String INPUT_LOWERCHAR ="lowerchar";
		public static String INPUT_UPPERCHAR ="upperchar";
		public static String INPUT_CHINESE ="chinese";
		public static String INPUT_ALL ="numberandchar";	
		
		//交易权限检查类型
		public static String TASKRIGHTCHECKTYPE_NOT ="0";
		public static String TASKRIGHTCHECKTYPE_YES ="1";
		
		/* 柜员权限隐藏菜单 */
		public static String TASK_RIGHT_HIDE_FALSE ="0";
		public static String TASK_RIGHT_HIDE_TRUE ="1";
		
		//窗体扭转栏位分隔符,不能用&，应该XML报文中通过&转义的
		public static String PARAMETER_FIELD_SPLIT ="*!@!";
		public static String PARAMETER_VALUE_SPLIT ="=";
		
		public static String TRXPARAMETER_FIELD_SPLIT ="#*!@";
		
		//通讯报文变量间分隔符
		public static String QUERYPARA_SPLIT ="|*#!#*@|";
		public static String PARA_FIELD_SPLIT ="#!@!*@";
		public static String PARA_VALUE_SPLIT ="=";
		
		public static String QUERYHEADER_SPLIT ="|";
		public static String QUERYFLAGFIELD_SPLIT =",";
		
		public static int REQUEST_MESSAGE_MAX_LENGTH=7500;
		
		public static String REQUEST_TYPE_REQUEST ="request";
		public static String REQUEST_TYPE_QUERY ="query";
		
		public static String REQUEST_MESSAAGE_TYPE_SPLIT ="split";
		public static String REQUEST_MESSAAGE_TYPE_XML ="xml";
		
		//public static String REQUEST_MESSAAGE_TYPE =REQUEST_MESSAAGE_TYPE_SPLIT;
		
		//public static String REQUEST_DATA_TYPE =REQUEST_DATA_BIN;
		public static String REQUEST_DATA_BIN ="bin";
		public static String REQUEST_DATA_TEXT ="text";
	}