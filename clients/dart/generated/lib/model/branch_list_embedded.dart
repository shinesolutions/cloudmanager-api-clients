part of openapi.api;

class BranchListEmbedded {
  
  List<RepositoryBranch> branches = [];
  BranchListEmbedded();

  @override
  String toString() {
    return 'BranchListEmbedded[branches=$branches, ]';
  }

  BranchListEmbedded.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    branches = (json['branches'] == null) ?
      null :
      RepositoryBranch.listFromJson(json['branches']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (branches != null)
      json['branches'] = branches;
    return json;
  }

  static List<BranchListEmbedded> listFromJson(List<dynamic> json) {
    return json == null ? List<BranchListEmbedded>() : json.map((value) => BranchListEmbedded.fromJson(value)).toList();
  }

  static Map<String, BranchListEmbedded> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, BranchListEmbedded>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = BranchListEmbedded.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of BranchListEmbedded-objects as value to a dart map
  static Map<String, List<BranchListEmbedded>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<BranchListEmbedded>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = BranchListEmbedded.listFromJson(value);
       });
     }
     return map;
  }
}

