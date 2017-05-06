
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvince Neil
 */
public class printWork  {
    
//    public void printWork()
//{
//    PrinterJob pj = PrinterJob.getPrinterJob();
//    pj.setJobName(" Opt De Solver Printing ");
//
//    pj.setPrintable(new Printable()
//    {
//        public int print(Graphics pg, PageFormat pf, int pageNum)
//        {
//            if(pageNum > 0)
//                return Printable.NO_SUCH_PAGE;
//
//            Graphics2D g2 = (Graphics2D)pg;
//            g2.translate(pf.getImageableX(), pf.getImageableY());
//            MainAppPanel.this.paintAll(g2);
//            /* I've tried the following commented codes but they don't work */
//            //MainAppPanel.this.printAll(g2);
//            //MainAppPanel.this.print(g2);
//            //MainAppPanel.this.print(g2);
//            return Printable.PAGE_EXISTS;
//        }
//
//        @Override
//        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    });
//    if(pj.printDialog() == false)
//        return;
//    try
//    {
//        pj.print();
//    }
//    catch(PrinterException xcp)
//    {
//        xcp.printStackTrace(System.err);
//    }
//}
    
}
