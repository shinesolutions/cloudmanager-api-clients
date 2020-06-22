part of openapi.api;

class RepositoryListEmbedded {
  
  List<Repository> repositories = [];
  RepositoryListEmbedded();

  @override
  String toString() {
    return 'RepositoryListEmbedded[repositories=$repositories, ]';
  }

  RepositoryListEmbedded.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    repositories = (json['repositories'] == null) ?
      null :
      Repository.listFromJson(json['repositories']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (repositories != null)
      json['repositories'] = repositories;
    return json;
  }

  static List<RepositoryListEmbedded> listFromJson(List<dynamic> json) {
    return json == null ? List<RepositoryListEmbedded>() : json.map((value) => RepositoryListEmbedded.fromJson(value)).toList();
  }

  static Map<String, RepositoryListEmbedded> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, RepositoryListEmbedded>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = RepositoryListEmbedded.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of RepositoryListEmbedded-objects as value to a dart map
  static Map<String, List<RepositoryListEmbedded>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<RepositoryListEmbedded>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = RepositoryListEmbedded.listFromJson(value);
       });
     }
     return map;
  }
}

