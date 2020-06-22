part of openapi.api;

class Repository {
  /* Repository name */
  String repo = null;
  /* description */
  String description = null;
  
  RepositoryLinks links = null;
  Repository();

  @override
  String toString() {
    return 'Repository[repo=$repo, description=$description, links=$links, ]';
  }

  Repository.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    repo = json['repo'];
    description = json['description'];
    links = (json['_links'] == null) ?
      null :
      RepositoryLinks.fromJson(json['_links']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (repo != null)
      json['repo'] = repo;
    if (description != null)
      json['description'] = description;
    if (links != null)
      json['_links'] = links;
    return json;
  }

  static List<Repository> listFromJson(List<dynamic> json) {
    return json == null ? List<Repository>() : json.map((value) => Repository.fromJson(value)).toList();
  }

  static Map<String, Repository> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, Repository>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = Repository.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Repository-objects as value to a dart map
  static Map<String, List<Repository>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<Repository>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = Repository.listFromJson(value);
       });
     }
     return map;
  }
}

