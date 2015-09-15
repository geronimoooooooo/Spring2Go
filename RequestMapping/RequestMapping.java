@RequestMapping(value ="/get", method = RequestMethod.GET)



@RequestMapping(value="/home.jsp", method = RequestMethod.POST)
  public String post(final User user, final BindingResult result, Model mv) {

     String test=" inside here";

      return "success";
  }
