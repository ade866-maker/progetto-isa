package com.unife.Prova.Controller;

import com.unife.Prova.model.Compra;
import com.unife.Prova.model.Libreria;
import com.unife.Prova.model.Libro;
import com.unife.Prova.model.Luogo;
import com.unife.Prova.model.Persona;
import com.unife.Prova.service.CompraService;
import com.unife.Prova.service.LibreriaService;
import com.unife.Prova.service.LibroService;
import com.unife.Prova.service.LuogoService;
import com.unife.Prova.service.PersonaService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProvaController {
    
    @Autowired
    private LibroService libroService;
    @Autowired
   private LuogoService luogoService;
    @Autowired
   private PersonaService personaService;
    @Autowired
    private CompraService compraService;
    @Autowired
    private LibreriaService libreriaService;
    
    /**
     * Metodi GET pagine: book,libreria,compra,persona,luogo,error.
     * I seguenti metodi si occupano di restituire al view le pagine definite 
     * all'interno del model.
     * Nel caso di libri, libreria, compra, persona e luogo si occupano inoltre
     * della visualizzazione degli elementi definiti nel databse
     */
    @RequestMapping(value="/",method=RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("Home");
        return mav;
    }
    
    @RequestMapping(value="/book",method=RequestMethod.GET)
    public ModelAndView book(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("book");
        mav.addObject("Listalibri", libroService.getAll());
        mav.addObject("libro", new Libro());
        return mav;
    }
            
    @RequestMapping(value="/libreria",method=RequestMethod.GET)
    public ModelAndView libreria(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("libreria");
        mav.addObject("Listalibreria", libreriaService.getAll());
        mav.addObject("Listaluogo", luogoService.getAll());
        mav.addObject("Listalibro", libroService.getAll());
        mav.addObject("libreria", new Libreria());
        return mav;
    }
            
    @RequestMapping(value="/compra",method=RequestMethod.GET)
    public ModelAndView compra(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("compra");
        mav.addObject("Listacompra", compraService.getAll());
        mav.addObject("Listapersona", personaService.getAll());
        mav.addObject("Listalibreria", libreriaService.getAll());
        mav.addObject("compra", new Compra());
        return mav;
    }
            
    @RequestMapping(value="/persona",method=RequestMethod.GET)
    public ModelAndView persona(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("persona");
        mav.addObject("Listapersona", personaService.getAll());
        mav.addObject("persona", new Persona());
        return mav;
    }
            
    @RequestMapping(value="/luogo",method=RequestMethod.GET)
    public ModelAndView luogo(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("luogo");
        mav.addObject("Listaluogo", luogoService.getAll());
        mav.addObject("luogo", new Luogo());
        return mav;
    }
            
    @RequestMapping(value="/error",method=RequestMethod.GET)
    public ModelAndView error(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("error");
        return mav;
    }  
    
    /**
     * Metodi POST pagine: book,libreria,compra,persona,luogo.
     * I seguenti metodi si occupano del salvataggio, rispettivamente, di libri,
     * librerie, ordini, persone e luoghi attraverso l'invocazione dei metodi save
     * definiti nei vari service.
     */
    
          @RequestMapping(value="/book",method=RequestMethod.POST)
            public ModelAndView add(Libro libro,BindingResult bindingResult){
            ModelAndView mav=new ModelAndView();
            libroService.savelibro(libro);
            mav.addObject("Listalibri", libroService.getAll());
            mav.addObject("libro", new Libro());
            mav.setViewName("book");
            return mav;
        }
            @RequestMapping(value="/libreria",method=RequestMethod.POST)
            public ModelAndView add(Libreria libreria,BindingResult bindingResult){
            ModelAndView mav=new ModelAndView();
            libreriaService.savelibreria(libreria);
            mav.addObject("Listalibreria", libreriaService.getAll());
            mav.addObject("libreria", new Libreria());
            mav.setViewName("libreria");
            return mav;
        }
            @RequestMapping(value="/compra",method=RequestMethod.POST)
            public ModelAndView add(Compra compra,BindingResult bindingResult){
            ModelAndView mav=new ModelAndView();
            compraService.savecompra(compra);
            mav.addObject("Listacompra", compraService.getAll());
            mav.addObject("compra", new Compra());
            mav.setViewName("compra");
            return mav;
        }  
              
        @RequestMapping(value="/persona",method=RequestMethod.POST)
            public ModelAndView add(Persona persona,BindingResult bindingResult){
            ModelAndView mav=new ModelAndView();
            personaService.savepersona(persona);
            mav.addObject("Listapersona", personaService.getAll());
            mav.addObject("persona", new Persona());
            mav.setViewName("persona");
            return mav;
        }
           
        @RequestMapping(value="/luogo",method=RequestMethod.POST)
            public ModelAndView add(Luogo luogo,BindingResult bindingResult){
            ModelAndView mav=new ModelAndView();
            luogoService.saveluogo(luogo);
            mav.addObject("Listaluogo", luogoService.getAll());
            mav.addObject("luogo", new Luogo());
            mav.setViewName("luogo");
            return mav;
        } 
            
        /**
         * GET relativi ai metodi EDIT pagine: libri, persona, libreria, luogo.
         * Si occupano di restituire le pagine di EDIT per la modifica relativa
         * alle classi sopra citate.
         */   
            
        @RequestMapping(value="/edit/book{libroId}",method=RequestMethod.GET)
            public ModelAndView update(@PathVariable Integer libroId){
            ModelAndView mav=new ModelAndView();
            mav.addObject("libro", libroService.findById(libroId));
            mav.setViewName("edit_libro");
            return mav;
        }
            
        @RequestMapping(value="/edit/persona{personaId}",method=RequestMethod.GET)
            public ModelAndView updates(@PathVariable Integer personaId){
            ModelAndView mav=new ModelAndView();
            mav.addObject("persona", personaService.findById(personaId));
            mav.setViewName("edit_persona");
            return mav;
        }
            
        @RequestMapping(value="/edit/libreria{libreriaId}",method=RequestMethod.GET)
            public ModelAndView updatess(@PathVariable Integer libreriaId){
            ModelAndView mav=new ModelAndView();
            mav.addObject("libreria", libreriaService.findById(libreriaId));
            mav.addObject("Listaluogo", luogoService.getAll());
            mav.addObject("Listalibro", libroService.getAll());
            mav.setViewName("edit_libreria");
            return mav;
        }
     
        @RequestMapping(value="/edit/luogo{luogoId}",method=RequestMethod.GET)
            public ModelAndView updatesss(@PathVariable Integer luogoId){
            ModelAndView mav=new ModelAndView();
            mav.addObject("luogo", luogoService.findById(luogoId));
            mav.setViewName("edit_luogo");
            return mav;
        }
    
        /**
         * POST relativi metodi EDIT pagine: libro, persona, librerie, luoghi.
         * Si occupano della modifica degli elementi definiti nel database
         * attraverso l'invocazione del metodo save definiti nei vari service
         */
            
        @RequestMapping(value="/editbook",method= RequestMethod.POST)
            public ModelAndView do_update(Libro n, BindingResult bindingResult){
            libroService.savelibro(n);
            return new ModelAndView("redirect:/book");
        }
          
        @RequestMapping(value="/editpersona",method= RequestMethod.POST)
            public ModelAndView do_update(Persona n, BindingResult bindingResult){
            personaService.savepersona(n);
            return new ModelAndView("redirect:/persona");
        } 
    
        @RequestMapping(value="/editlibreria",method= RequestMethod.POST)
            public ModelAndView do_update(Libreria n, BindingResult bindingResult){
            libreriaService.savelibreria(n);
            return new ModelAndView("redirect:/libreria");
        } 
           
        @RequestMapping(value="/editluogo",method= RequestMethod.POST)
            public ModelAndView do_update(Luogo n, BindingResult bindingResult){
            luogoService.saveluogo(n);
            return new ModelAndView("redirect:/luogo");
        } 
            
         /**
          * GET relativi metodi DELETE pagine: libro, persona, librerie, luoghi.
          * Si occupano di restutuire le pagine di cancellazione delle suddette
          * classi
          */
    
        @RequestMapping(value="/delete/book{libroId}",method=RequestMethod.GET)
            public ModelAndView delete_confirm(@PathVariable Integer libroId){
            ModelAndView mav=new ModelAndView();
            Optional<Libro> libroFound=libroService.findById(libroId);
            mav.addObject("libro", libroFound.get());
            mav.setViewName("delete_confirmbook");
            return mav;
        }
            
        @RequestMapping(value="/delete/persona{personaId}",method=RequestMethod.GET)
            public ModelAndView delete_confirms(@PathVariable Integer personaId){
            ModelAndView mav=new ModelAndView();
            Optional<Persona> personaFound=personaService.findById(personaId);
            mav.addObject("persona", personaFound.get());
            mav.setViewName("delete_confirmpersona");
            return mav;
        }
            
        @RequestMapping(value="/delete/libreria{libreriaId}",method=RequestMethod.GET)
            public ModelAndView delete_confirmss(@PathVariable Integer libreriaId){
            ModelAndView mav=new ModelAndView();
            Optional<Libreria> libreriaFound=libreriaService.findById(libreriaId);
            mav.addObject("libreria", libreriaFound.get());
            mav.setViewName("delete_confirmlibreria");
            return mav;
        }
            
        @RequestMapping(value="/delete/luogo{luogoId}",method=RequestMethod.GET)
            public ModelAndView delete_confirmsss(@PathVariable Integer luogoId){
            ModelAndView mav=new ModelAndView();
            Optional<Luogo> luogoFound=luogoService.findById(luogoId);
            mav.addObject("luogo", luogoFound.get());
            mav.setViewName("delete_confirmluogo");
            return mav;
        }
            
        /**
         * POST relativi metodi DELETE pagine: libro, persona, librerie, luoghi.
         * Si occupano della cancellazione degli elementi definiti nel database
         * attraverso l'invocazione dei metodi .delete in cui viene passato l'ID
         * relativo all'elemento da cancellare
         */    
            
        @RequestMapping(value="/do_deletebook",method= RequestMethod.POST)
            public ModelAndView do_delete(Libro n, BindingResult bindingResult){
            libroService.deleteLibro(n.getId());
            return new ModelAndView("redirect:/book");
        }    
            
        @RequestMapping(value="/do_deletepersona",method= RequestMethod.POST)
            public ModelAndView do_delete(Persona n, BindingResult bindingResult){
            personaService.deletepersona(n.getId());
            return new ModelAndView("redirect:/persona");
        }
    
        @RequestMapping(value="/do_deleteluogo",method= RequestMethod.POST)
            public ModelAndView do_delete(Luogo n, BindingResult bindingResult){
            luogoService.deleteLuogo(n.getId());
            return new ModelAndView("redirect:/luogo");
        }
            
        @RequestMapping(value="/do_deletelibreria",method= RequestMethod.POST)
            public ModelAndView do_delete(Libreria n, BindingResult bindingResult){
            libreriaService.deleteLibreria(n.getId());
            return new ModelAndView("redirect:/libreria");
    }    
}
