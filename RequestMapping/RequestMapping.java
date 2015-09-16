@RequestMapping(value ="/get", method = RequestMethod.GET)



@RequestMapping(value="/home.jsp", method = RequestMethod.POST)
  public String post(final User user, final BindingResult result, Model mv) {

     String test=" inside here";

      return "success";
  }


@RequestMapping(value="/Contact",method=RequestMethod.GET)
    ModelAndView Contact(Model model)
    {
        model.addAttribute("UserQuery",new Query());
        User userForm = new User();
        model.addAttribute("command", userForm);

        return new ModelAndView("contactView");
    }
