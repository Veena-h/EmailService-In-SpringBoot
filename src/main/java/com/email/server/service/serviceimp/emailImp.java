package com.email.server.service.serviceimp;

import com.email.server.entity.Email;
import com.email.server.service.Emailservices;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.Cookie;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class emailImp implements Emailservices
{

    @Autowired
    JavaMailSender javaMailSender;
    final Cookie cookie= new Cookie();

    final static String From="veenahadimani123@gmail.com";


    @Override
    public void emailsend(String to, String subject, String message)
    {
        SimpleMailMessage sm=new SimpleMailMessage();
        sm.setTo(to);
        sm.setSubject(subject);
        sm.setText(message);
        sm.setFrom(From);
        javaMailSender.send(sm);

    }

    @Override
    public void Bulkemails(String[] to, String subject, String message) {

        SimpleMailMessage sm=new SimpleMailMessage();
        sm.setTo(to);
        sm.setSubject(subject);
        sm.setText(message);
        sm.setFrom(From);
        javaMailSender.send(sm);


    }

    @Override
    public void emailsendWithHTML(String to, String subject, String message) throws MessagingException {


        String template= "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" lang=\"en\"><head><meta charset=\"UTF-8\"><meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"><meta name=\"x-apple-disable-message-reformatting\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><meta content=\"telephone=no\" name=\"format-detection\"><title>New Template</title> <!--[if (mso 16)]><style type=\"text/css\">     a {text-decoration: none;}     </style><![endif]--> <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> <!--[if gte mso 9]><xml> <o:OfficeDocumentSettings> <o:AllowPNG></o:AllowPNG> <o:PixelsPerInch>96</o:PixelsPerInch> </o:OfficeDocumentSettings> </xml>\n" +
                "<![endif]--> <!--[if mso]><style type=\"text/css\">      ul {   margin: 0 !important;   }   ol {   margin: 0 !important;   }   li {   margin-left: 47px !important;   }  </style>\n" +
                "<![endif] --><style type=\"text/css\">.rollover:hover .rollover-first { max-height:0px!important; display:none!important; } .rollover:hover .rollover-second { max-height:none!important; display:block!important; } .rollover span { font-size:0px; } u + .body img ~ div div { display:none; } #outlook a { padding:0; } span.MsoHyperlink,span.MsoHyperlinkFollowed { color:inherit; mso-style-priority:99; } a.es-button { mso-style-priority:100!important; text-decoration:none!important; } a[x-apple-data-detectors] { color:inherit!important; text-decoration:none!important; font-size:inherit!important; font-family:inherit!important; font-weight:inherit!important; line-height:inherit!important; } .es-desk-hidden { display:none; float:left; overflow:hidden; width:0; max-height:0; line-height:0; mso-hide:all; } .es-button-border:hover > a.es-button { color:#ffffff!important; }\n" +
                "@media only screen and (max-width:600px) {.es-m-p0r { padding-right:0px!important } *[class=\"gmail-fix\"] { display:none!important } p, a { line-height:150%!important } h1, h1 a { line-height:120%!important } h2, h2 a { line-height:120%!important } h3, h3 a { line-height:120%!important } h4, h4 a { line-height:120%!important } h5, h5 a { line-height:120%!important } h6, h6 a { line-height:120%!important } h1 { font-size:36px!important; text-align:left } h2 { font-size:26px!important; text-align:left } h3 { font-size:20px!important; text-align:left } h4 { font-size:24px!important; text-align:left } h5 { font-size:20px!important; text-align:left } h6 { font-size:16px!important; text-align:left } .es-header-body h1 a, .es-content-body h1 a, .es-footer-body h1 a { font-size:36px!important } .es-header-body h2 a, .es-content-body h2 a, .es-footer-body h2 a { font-size:26px!important }\n" +
                " .es-header-body h3 a, .es-content-body h3 a, .es-footer-body h3 a { font-size:20px!important } .es-header-body h4 a, .es-content-body h4 a, .es-footer-body h4 a { font-size:24px!important } .es-header-body h5 a, .es-content-body h5 a, .es-footer-body h5 a { font-size:20px!important } .es-header-body h6 a, .es-content-body h6 a, .es-footer-body h6 a { font-size:16px!important } .es-menu td a { font-size:12px!important } .es-header-body p, .es-header-body a { font-size:14px!important } .es-content-body p, .es-content-body a { font-size:14px!important } .es-footer-body p, .es-footer-body a { font-size:14px!important } .es-infoblock p, .es-infoblock a { font-size:12px!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3, .es-m-txt-c h4, .es-m-txt-c h5, .es-m-txt-c h6 { text-align:center!important }\n" +
                " .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3, .es-m-txt-r h4, .es-m-txt-r h5, .es-m-txt-r h6 { text-align:right!important } .es-m-txt-j, .es-m-txt-j h1, .es-m-txt-j h2, .es-m-txt-j h3, .es-m-txt-j h4, .es-m-txt-j h5, .es-m-txt-j h6 { text-align:justify!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3, .es-m-txt-l h4, .es-m-txt-l h5, .es-m-txt-l h6 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-m-txt-r .rollover:hover .rollover-second, .es-m-txt-c .rollover:hover .rollover-second, .es-m-txt-l .rollover:hover .rollover-second { display:inline!important } .es-m-txt-r .rollover span, .es-m-txt-c .rollover span, .es-m-txt-l .rollover span { line-height:0!important; font-size:0!important } .es-spacer { display:inline-table } a.es-button, button.es-button { font-size:20px!important; line-height:120%!important }\n" +
                " a.es-button, button.es-button, .es-button-border { display:inline-block!important } .es-m-fw, .es-m-fw.es-fw, .es-m-fw .es-button { display:block!important } .es-m-il, .es-m-il .es-button, .es-social, .es-social td, .es-menu { display:inline-block!important } .es-adaptive table, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .adapt-img { width:100%!important; height:auto!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } tr.es-desk-hidden { display:table-row!important } table.es-desk-hidden { display:table!important } td.es-desk-menu-hidden { display:table-cell!important } .es-menu td { width:1%!important }\n" +
                " table.es-table-not-adapt, .esd-block-html table { width:auto!important } .es-social td { padding-bottom:10px } .h-auto { height:auto!important } }@media screen and (max-width:384px) {.mail-message-content { width:414px!important } }</style>\n" +
                " </head> <body class=\"body\" style=\"width:100%;height:100%;padding:0;Margin:0\"><div dir=\"ltr\" class=\"es-wrapper-color\" lang=\"en\" style=\"background-color:#FAFAFA\"> <!--[if gte mso 9]> <v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\"> <v:fill type=\"tile\" color=\"#fafafa\"></v:fill> </v:background><![endif]--><table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;background-color:#FAFAFA\"><tr>\n" +
                "<td valign=\"top\" style=\"padding:0;Margin:0\"><table class=\"es-header\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;width:100%;table-layout:fixed !important;background-color:transparent;background-repeat:repeat;background-position:center top\"><tr><td align=\"center\" style=\"padding:0;Margin:0\"><table class=\"es-header-body\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;width:600px\"><tr><td align=\"left\" style=\"Margin:0;padding-top:10px;padding-right:20px;padding-bottom:10px;padding-left:20px\"><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr>\n" +
                "<td class=\"es-m-p0r\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:560px\"><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr><td style=\"padding:0;Margin:0;padding-bottom:20px;font-size:0px\" align=\"center\"><img src=\"https://ehfzmej.stripocdn.email/content/guids/CABINET_887f48b6a2f22ad4fb67bc2a58c0956b/images/93351617889024778.png\" alt=\"Logo\" style=\"display:block;font-size:12px;border:0;outline:none;text-decoration:none\" title=\"Logo\" width=\"200\" height=\"48\"></td> </tr><tr><td style=\"padding:0;Margin:0\"><table class=\"es-menu\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr class=\"links\">\n" +
                "<td style=\"Margin:0;border:0;padding-top:15px;padding-bottom:15px;padding-right:5px;padding-left:5px\" width=\"50%\" valign=\"top\" align=\"center\"><a target=\"_blank\" href=\"\" style=\"mso-line-height-rule:exactly;text-decoration:none;font-family:arial, 'helvetica neue', helvetica, sans-serif;display:block;color:#666666;font-size:14px\">+0 (000) 123 45 67</a></td> <td style=\"Margin:0;border:0;padding-top:15px;padding-bottom:15px;padding-right:5px;padding-left:5px\" width=\"50%\" valign=\"top\" align=\"center\"><a target=\"_blank\" href=\"\" style=\"mso-line-height-rule:exactly;text-decoration:none;font-family:arial, 'helvetica neue', helvetica, sans-serif;display:block;color:#666666;font-size:14px\">parker@email.com</a></td></tr></table></td></tr></table></td></tr></table></td></tr></table></td></tr></table>\n" +
                " <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;width:100%;table-layout:fixed !important\"><tr><td align=\"center\" style=\"padding:0;Margin:0\"><table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;border-top:10px solid #5C68E2;width:600px;border-bottom:10px solid #5C68E2\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\" role=\"none\"><tr><td align=\"left\" style=\"padding:0;Margin:0;padding-right:20px;padding-left:20px;padding-top:30px\"><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr>\n" +
                "<td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:560px\"><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr><td align=\"left\" style=\"padding:0;Margin:0\"><p style=\"Margin:0;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;line-height:21px;letter-spacing:0;color:#666666;font-size:14px\">October 1, 2021</p> </td></tr></table></td></tr></table></td></tr> <tr>\n" +
                "<td style=\"padding:0;Margin:0;padding-right:20px;padding-left:20px;padding-top:20px;background-image:url(https://ehfzmej.stripocdn.email/content/guids/CABINET_dffae7f979b41546fc080436b1b370e5/images/61791626685093335.png);background-repeat:no-repeat;background-position:center 80px\" background=\"https://ehfzmej.stripocdn.email/content/guids/CABINET_dffae7f979b41546fc080436b1b370e5/images/61791626685093335.png\" align=\"left\"><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr><td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;width:560px\"><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr>\n" +
                "<td class=\"es-m-txt-l\" align=\"left\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-top:5px\"><h3 style=\"Margin:0;font-family:arial, 'helvetica neue', helvetica, sans-serif;mso-line-height-rule:exactly;letter-spacing:0;font-size:20px;font-style:normal;font-weight:bold;line-height:24px;color:#5c68e2\">Dear *|Veena|*,</h3> </td></tr><tr><td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-top:5px\"><p style=\"Margin:0;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;line-height:21px;letter-spacing:0;color:#333333;font-size:14px\">It was nice meeting you.</p><p style=\"Margin:0;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;line-height:21px;letter-spacing:0;color:#333333;font-size:14px\">This email is a short follow-up to the conversation that took place online yesterday.<br><br><strong>Things we agreed on:</strong></p>\n" +
                "<ul style=\"font-family:arial, 'helvetica neue', helvetica, sans-serif;padding:0px 0px 0px 40px;margin:15px 0px\"> <li style=\"color:#333333;margin:0px 0px 15px;font-size:14px\">Both sides are to finish&nbsp;preparation for collaboration. Due date: October 1, 2021.</li> <li style=\"color:#333333;margin:0px 0px 15px;font-size:14px\">Both sides agreed on the payment conditions -- we will send them in a new&nbsp;email.</li> <li style=\"color:#333333;margin:0px 0px 15px;font-size:14px\">Invoices will be sent 5 businesses days before the billing period ends.</li> <li style=\"color:#333333;margin:0px 0px 15px;font-size:14px\">Online meetings will take place every second Friday of the month starting from June.</li> </ul>\n" +
                "<p style=\"Margin:0;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;line-height:21px;letter-spacing:0;color:#333333;font-size:14px\">All these questions and conditions are a subject for further discussion.<br><br>Dear "+ message+ ", I hope our collaboration will be fruitful for both sides.<br><br>Sincerely,<br>Aaron Parker.<br><br></p></td></tr> <tr><td class=\"es-m-txt-l\" style=\"padding:0;Margin:0;padding-bottom:20px;font-size:0px\" align=\"left\"><img src=\"https://ehfzmej.stripocdn.email/content/guids/CABINET_dffae7f979b41546fc080436b1b370e5/images/89501626684388018.png\" alt=\"\" style=\"display:block;font-size:14px;border:0;outline:none;text-decoration:none\" width=\"260\" height=\"95\"></td></tr></table></td></tr></table></td></tr></table></td></tr></table>\n" +
                " <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;width:100%;table-layout:fixed !important\"><tr><td align=\"center\" style=\"padding:0;Margin:0\"><table class=\"es-content-body\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;width:600px\"><tr><td align=\"left\" style=\"padding:20px;Margin:0\"> <!--[if mso]><table style=\"width:560px\" cellpadding=\"0\" cellspacing=\"0\"><tr><td style=\"width:115px\" valign=\"top\"><![endif]--><table class=\"es-left\" cellspacing=\"0\" cellpadding=\"0\" align=\"left\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left\"><tr>\n" +
                "<td align=\"left\" style=\"padding:0;Margin:0;width:115px\"><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr><td class=\"es-m-txt-c\" style=\"padding:0;Margin:0;padding-top:5px;padding-bottom:5px;font-size:0px\" align=\"right\"><img src=\"https://ehfzmej.stripocdn.email/content/guids/CABINET_dffae7f979b41546fc080436b1b370e5/images/12581621865359778.png\" alt=\"\" style=\"display:block;font-size:14px;border:0;outline:none;text-decoration:none\" width=\"115\" height=\"115\"></td> </tr></table></td></tr></table> <!--[if mso]></td><td style=\"width:20px\"></td><td style=\"width:425px\" valign=\"top\"><![endif]--><table class=\"es-right\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\" role=\"none\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right\"><tr>\n" +
                "<td align=\"left\" style=\"padding:0;Margin:0;width:425px\"><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr><td class=\"es-m-txt-c\" align=\"left\" style=\"padding:0;Margin:0\"><h3 style=\"Margin:0;font-family:arial, 'helvetica neue', helvetica, sans-serif;mso-line-height-rule:exactly;letter-spacing:0;font-size:20px;font-style:normal;font-weight:bold;line-height:30px;color:#5c68e2\">Aaron Parker</h3> <p style=\"Margin:0;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;line-height:21px;letter-spacing:0;color:#333333;font-size:14px\">CEO of \"Style Casual\"</p>\n" +
                "<p style=\"Margin:0;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;line-height:21px;letter-spacing:0;color:#333333;font-size:14px\"><a target=\"_blank\" style=\"mso-line-height-rule:exactly;text-decoration:none;color:#333333;font-size:14px;line-height:21px\" href=\"\">+0 (000) 123 456 789</a></p><p style=\"Margin:0;mso-line-height-rule:exactly;font-family:arial, 'helvetica neue', helvetica, sans-serif;line-height:21px;letter-spacing:0;color:#333333;font-size:14px\"><a target=\"_blank\" href=\"mailto:aaronparker@email.com\" style=\"mso-line-height-rule:exactly;text-decoration:underline;color:#333333;font-size:14px;line-height:21px\">parker@email.com</a></p></td></tr> <tr>\n" +
                "<td class=\"es-m-txt-c\" style=\"padding:0;Margin:0;padding-top:5px;padding-bottom:5px;font-size:0\" align=\"left\"><table class=\"es-table-not-adapt es-social\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px\"><tr><td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;padding-right:10px\"><img title=\"Facebook\" src=\"https://ehfzmej.stripocdn.email/content/assets/img/social-icons/logo-black/facebook-logo-black.png\" alt=\"Fb\" width=\"24\" height=\"24\" style=\"display:block;font-size:14px;border:0;outline:none;text-decoration:none\"></td> <td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;padding-right:10px\"><img title=\"X.com\" src=\"https://ehfzmej.stripocdn.email/content/assets/img/social-icons/logo-black/x-logo-black.png\" alt=\"X\" width=\"24\" height=\"24\" style=\"display:block;font-size:14px;border:0;outline:none;text-decoration:none\"></td>\n" +
                "<td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;padding-right:10px\"><img title=\"Instagram\" src=\"https://ehfzmej.stripocdn.email/content/assets/img/social-icons/logo-black/instagram-logo-black.png\" alt=\"Inst\" width=\"24\" height=\"24\" style=\"display:block;font-size:14px;border:0;outline:none;text-decoration:none\"></td><td valign=\"top\" align=\"center\" style=\"padding:0;Margin:0\"><img title=\"Youtube\" src=\"https://ehfzmej.stripocdn.email/content/assets/img/social-icons/logo-black/youtube-logo-black.png\" alt=\"Yt\" width=\"24\" height=\"24\" style=\"display:block;font-size:14px;border:0;outline:none;text-decoration:none\"></td></tr> </table></td></tr></table></td></tr></table> <!--[if mso]></td></tr></table><![endif]--></td></tr></table></td></tr></table></td></tr></table></div></body></html>";



        MimeMessage mm=javaMailSender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(mm);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(template,true);
        javaMailSender.send(mm);



    }

    @Override
    public boolean otpsend(String email)
    {
        Random r=new Random();
        int otp=r.nextInt(9999)+1000;

        SimpleMailMessage sm=new SimpleMailMessage();
        String msg=" "+otp;
        cookie.setName(msg);
        sm.setTo(email);
        sm.setSubject("OTP Verification");
        sm.setText("OTP :" +msg);
        sm.setFrom(From);
        javaMailSender.send(sm);
        return true;
    }

//    @Override
//    public boolean verify(String otp)
//    {
//      return true;
//
//    }
}
