package ahwa.attila.ui.android.views.category;


public class CategoryNewView
	extends ahwa.attila.ui.android.views.category.BaseCategoryEditView_1
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Ahwa.Attila.UI.Android.Views.Category.CategoryNewView, Blooor, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CategoryNewView.class, __md_methods);
	}


	public CategoryNewView ()
	{
		super ();
		if (getClass () == CategoryNewView.class)
			mono.android.TypeManager.Activate ("Ahwa.Attila.UI.Android.Views.Category.CategoryNewView, Blooor, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
