@Controller
@Component //for simple bean
@Qualifier

@Resource(name="applicationUser") //Standard @Resource annotation marks a resource that is needed by the application.
    private ApplicationUser user;
    
    Standard @Resource annotation marks a resource that is needed by the application. 
    It is analogous to @Autowired in that both injects beans by type when no attribute provided. 
    But with name attribute, @Resource allows you to inject a bean by it’s name, which @Autowired does not.
    In above code, Application’s user property is annotated with @Resource(name=”applicationUser”). 
    In this case, a bean with name ‘applicationUser’ found in applicationContext will be injected here.
    
@RequestMapping(value ="/get", method = RequestMethod.GET)
